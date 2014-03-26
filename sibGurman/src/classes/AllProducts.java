package classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;

import sequenia.sibgurman.R;

public class AllProducts {

	public static List<ProductCategory> allProducts;

	public static void initAllProducts(Context context) throws JSONException {
		InputStream is = context.getResources().openRawResource(
				R.raw.sibgurman_catalog);
		Writer writer = new StringWriter();
		char[] buffer = new char[1024];
		try {
			Reader reader = new BufferedReader(new InputStreamReader(is,
					"UTF-8"));
			int n;
			while ((n = reader.read(buffer)) != -1) {
				writer.write(buffer, 0, n);
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String jsonString = writer.toString();

		allProducts = new ArrayList<ProductCategory>();

		JSONObject jsonObject = new JSONObject(jsonString);
		JSONArray productCategoriesJSON = jsonObject
				.getJSONArray("product_categories");
		for (int i = 0; i < productCategoriesJSON.length(); i++) {
			JSONObject jsonCategory = productCategoriesJSON.getJSONObject(i);
			String categoryName = jsonCategory.getString("category_name");
			int id = jsonCategory.getInt("id");
			JSONArray jsonBrands = jsonCategory.getJSONArray("brands");
			List<Brand> brands = getBrandsFromJSONArray(context, jsonBrands);
			allProducts.add(new ProductCategory(id, categoryName, brands));
		}
	}

	private static List<Brand> getBrandsFromJSONArray(Context context,
			JSONArray jsonBrands) throws JSONException {
		List<Brand> result = new ArrayList<Brand>();
		for (int i = 0; i < jsonBrands.length(); i++) {
			JSONObject jsonBrand = jsonBrands.getJSONObject(i);
			String brandName = jsonBrand.getString("brand_name");
			String pictureName = jsonBrand.getString("logo");
			int pictureId = context.getResources().getIdentifier(pictureName,
					"drawable", context.getPackageName());
			JSONArray jsonProducts = jsonBrand.getJSONArray("products");
			List<Product> products = getProductsFromJSONArray(context,
					jsonProducts);
			result.add(new Brand(brandName, pictureId, products));
		}
		return result;
	}

	private static List<Product> getProductsFromJSONArray(Context context,
			JSONArray jsonProducts) throws JSONException {
		List<Product> result = new ArrayList<Product>();
		for (int i = 0; i < jsonProducts.length(); i++) {
			JSONObject jsonProduct = jsonProducts.getJSONObject(i);
			String productName = jsonProduct.getString("name");
			String desc = jsonProduct.getString("desc");
			String storage = jsonProduct.getString("storage");
			String pictureName = jsonProduct.getString("image");
			int pictureId = context.getResources().getIdentifier(pictureName,
					"drawable", context.getPackageName());
			JSONArray jsonPackages = jsonProduct.getJSONArray("package");
			List<Package> packages = getPackagesFromJSONArray(jsonPackages);
			Product product = new Product(productName, desc, storage,
					pictureId, packages);

			try {
				String brandListPictureName = jsonProduct
						.getString("image_brandlist");
				int brandListPicId = context.getResources().getIdentifier(
						brandListPictureName, "drawable",
						context.getPackageName());
				product.setPictureForListView(brandListPicId);
			} catch (Exception exception) {
				System.out.println("Brand list picture undefined");
			}
			
			result.add(product);
		}
		return result;
	}

	private static List<Package> getPackagesFromJSONArray(JSONArray jsonPackages)
			throws JSONException {
		List<Package> result = new ArrayList<Package>();
		for (int i = 0; i < jsonPackages.length(); i++) {
			JSONObject jsonPackage = jsonPackages.getJSONObject(i);
			String packageName = jsonPackage.getString("type");
			int qty = jsonPackage.getInt("qty");
			double weight = jsonPackage.getDouble("weight");
			result.add(new Package(qty, weight, packageName));
		}
		return result;
	}
}