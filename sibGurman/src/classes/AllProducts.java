package classes;

import java.util.ArrayList;
import java.util.List;

import food.sibgurman.R;

public class AllProducts {
	public static List<Brand> pelmens   = new ArrayList<Brand>();
	public static List<Brand> pancakes  = new ArrayList<Brand>();
	public static List<Brand> dumplings = new ArrayList<Brand>();
	public static List<Brand> dough     = new ArrayList<Brand>();
	public static List<Brand> soups     = new ArrayList<Brand>();
	public static List<Brand> chops     = new ArrayList<Brand>();
	
	public static void initAll()
	{	
	 initPelmens();	
	 initPancakes();
	 initDumplings();
	 initDough();
	 initSoups();
	 initChops();
	}
	
	public static void initChops() //Котлеты
	{
		List<Product> listProduct = new ArrayList<Product>();  
	    List<Package> listPackage = new ArrayList<Package>();
	    String stor = "Срок годности 180 суток при t – 18C";
	    listPackage.add(new Package(12, 0.48, "Лоток"));
	    listProduct.add(new Product("Тефтели", 
	    		"Рубленый полуфабрикат круглой формы с традиционной рецептурой. (80 гр/шт)",
	    		stor, R.id.logo, listPackage));
        listPackage = new ArrayList<Package>();
        chops.add(new Brand("Тефтели", listProduct));
        listProduct = new ArrayList<Product>();
        listPackage.add(new Package(12, 0.48, "Лоток"));
	    listProduct.add(new Product("Котлеты домашние", 
	    		"Традиционный вкус, основанный на сочетании свинины и говядины с добавлением лука. "
	    		+ "Самые популярные котлеты.",
	    		stor, R.id.logo, listPackage));
        listPackage = new ArrayList<Package>();
        chops.add(new Brand("Котлеты", listProduct));
        listProduct = new ArrayList<Product>();
        
        listPackage.add(new Package(12, 0.48, "Лоток"));
	    listProduct.add(new Product("Ёжики", 
	    		"Популярный продукт из мясного фарша с добавлением риса. (50 гр/шт)",
	    		stor, R.id.logo, listPackage));
        listPackage = new ArrayList<Package>();
        chops.add(new Brand("Ёжики", listProduct));
	}
	
	public static void initSoups() //Супы
	{
		List<Product> listProduct = new ArrayList<Product>();  
	    List<Package> listPackage = new ArrayList<Package>();
	    String stor = "Срок годности 180 суток при t – 18C";
	    listPackage.add(new Package(6, 0.5, "Пенал"));
	    listProduct.add(new Product("Грибной суп", 
	    		"Супы «Домашние Секреты» хорошие помощники в приготовлении настоящего домашнего супа."
	    		+ " Необходимо только опустить суп в кипящую воду и варить 15 мину, добавив соль и специи.",
	    		stor, R.id.logo, listPackage));
        listPackage = new ArrayList<Package>();
        listPackage.add(new Package(6, 0.5, "Пенал"));
	    listProduct.add(new Product("Борщ", 
	    		"Супы «Домашние Секреты» хорошие помощники в приготовлении настоящего домашнего супа."
	    		+ " Необходимо только опустить суп в кипящую воду и варить 15 мину, добавив соль и специи.",
	    		stor, R.drawable.android_logo, listPackage));
        listPackage = new ArrayList<Package>();
        listPackage.add(new Package(6, 0.5, "Пенал"));
	    listProduct.add(new Product("Солянка по-домашнему", 
	    		"Супы «Домашние Секреты» хорошие помощники в приготовлении настоящего домашнего супа."
	    		+ " Необходимо только опустить суп в кипящую воду и варить 15 мину, добавив соль и специи.",
	    		stor, R.id.logo, listPackage));
        listPackage = new ArrayList<Package>();
        soups.add(new Brand("Домашние секреты", listProduct));
	}
	
	
	public static void initDough() //Тесто
	{
		List<Product> listProduct = new ArrayList<Product>();  
	    List<Package> listPackage = new ArrayList<Package>();
	    String stor = "Срок годности 180 суток при t – 18C";
	    listPackage.add(new Package(7, 0.45, "Пакет"));
	    listProduct.add(new Product("Cлоеное пресное Едим Дома. 5 пластин", 
	    		"Тесто «Едим Дома» приготовлено на сливочном масле. Рецептура теста "
	    		+ "максимально приближена к домашней. Выпечка получается пышной.", stor, 
	    		R.id.logo, listPackage));
        listPackage = new ArrayList<Package>();
        listPackage.add(new Package(7, 0.45, "Пакет"));
	    listProduct.add(new Product("Cлоеное дрожжевое Едим Дома. 5 пластин", 
	    		"Тесто «Едим Дома» приготовлено на сливочном масле. Рецептура теста "
	    		+ "максимально приближена к домашней. Выпечка получается пышной.", stor, 
	    		R.id.logo, listPackage));
        listPackage = new ArrayList<Package>();
        listPackage.add(new Package(5, 0.45, "Пакет"));
	    listProduct.add(new Product("Cлоеное пресное Едим Дома. 2 пластины", 
	    		"Тесто «Едим Дома» приготовлено на сливочном масле. Рецептура теста "
	    		+ "максимально приближена к домашней. Выпечка получается пышной.", stor, 
	    		R.id.logo, listPackage));
        listPackage = new ArrayList<Package>();
        listPackage.add(new Package(5, 0.45, "Пакет"));
	    listProduct.add(new Product("Cлоеное дрожжевое Едим Дома. 2 пластины", 
	    		"Тесто «Едим Дома» приготовлено на сливочном масле. Рецептура теста "
	    		+ "максимально приближена к домашней. Выпечка получается пышной.", stor, 
	    		R.id.logo, listPackage));
        listPackage = new ArrayList<Package>();
        dough.add(new Brand("Едим Дома", listProduct));
	}
	
	public static void initDumplings() //Вареники
	{
		List<Product> listProduct = new ArrayList<Product>();  
	    List<Package> listPackage = new ArrayList<Package>();
	    String stor = "Срок годности 180 суток при t – 18C"; 
	    //ДОМАШНИЕ СЕКРЕТЫ
	    listPackage.add(new Package(8, 0.8, "Пакет"));
	    listProduct.add(new Product("Домашние Секреты с тушеной капустой", "Сытная начинка: свежая "
	    		+ "капуста тушится с томатом и пассерованными луком и морковью.", stor, 
	    		R.id.logo, listPackage));
        listPackage = new ArrayList<Package>();
        listPackage.add(new Package(16, 0.5, "Пакет"));
	    listPackage.add(new Package(12, 0.9, "Пакет"));
        listProduct.add(new Product("Домашние Секреты с картофелем", "Сытная начинка: свежий"
        		+ " репчатый лук пассеруются в масле и смешивается в картофельным пюре.", stor, 
	    		R.id.logo, listPackage));
        listPackage = new ArrayList<Package>();
        listPackage.add(new Package(16, 0.5, "Пакет"));
	    listPackage.add(new Package(12, 0.9, "Пакет"));
        listProduct.add(new Product("Домашние Секреты с картофелем и грибами", "Сытная начинка с грибным ассорти:"
        		+ " разные виды грибов обжариваются в масле и смешиваются с картофельным пюре.", stor, 
	    		R.id.logo, listPackage));
        listPackage = new ArrayList<Package>();
        listPackage.add(new Package(16, 0.5, "Пакет"));
        listProduct.add(new Product("Домашние Секреты с творогом", "Сладкая начинка из свежего творога"
        		+ " с сахаром и добавлением ванили.", stor, R.id.logo, listPackage));
        listPackage = new ArrayList<Package>();
        dumplings.add(new Brand("Домашние Секреты", listProduct));
        listProduct = new ArrayList<Product>();
        //ТРИ ЯГОДКИ
        listPackage.add(new Package(6, 0.45, "Пакет"));
        listProduct.add(new Product("Вареники «Три ягодки»", "Три вида ягодных вареников в одной "
        		+ "упаковке", stor, R.id.logo, listPackage));
        listPackage = new ArrayList<Package>();
        dumplings.add(new Brand("Три ягодки", listProduct));
	}
	
	public static void initPancakes() //Блины
	{
		List<Product> listProduct = new ArrayList<Product>();  
	    List<Package> listPackage = new ArrayList<Package>();
	    String stor = "Срок годности 120 суток при t – 18C\nСрок годности 180 суток при t – 22C"; 
	    //СОЛНЦЕПЕК(РУЛЕТЫ)
	    listPackage.add(new Package(14, 0.36, "Лоток"));
	    listProduct.add(new Product("С мясом", "Нежный пористый блинный лист наполняется вкусной и "
	    		+ "сочной начинкой и заворачивается в рулет.Продукт готов к употреблению, достаточно "
	    		+ "только разогреть.", stor, R.id.logo, listPackage));
        listPackage = new ArrayList<Package>();
        listPackage.add(new Package(14, 0.36, "Лоток"));
	    listProduct.add(new Product("С печенью и рисом", "Нежный пористый блинный лист наполняется вкусной и "
	    		+ "сочной начинкой и заворачивается в рулет.Продукт готов к употреблению, достаточно "
	    		+ "только разогреть.", stor, R.id.logo, listPackage));
        listPackage = new ArrayList<Package>();
        listPackage.add(new Package(14, 0.36, "Лоток"));
	    listProduct.add(new Product("С курицей", "Нежный пористый блинный лист наполняется вкусной и "
	    		+ "сочной начинкой и заворачивается в рулет.Продукт готов к употреблению, достаточно "
	    		+ "только разогреть.", stor, R.id.logo, listPackage));
        listPackage = new ArrayList<Package>();
        listPackage.add(new Package(14, 0.36, "Лоток"));
	    listProduct.add(new Product("C творогом", "Нежный пористый блинный лист наполняется вкусной и "
	    		+ "сочной начинкой и заворачивается в рулет.Продукт готов к употреблению, достаточно "
	    		+ "только разогреть.", stor, R.id.logo, listPackage));
        listPackage = new ArrayList<Package>();
        listPackage.add(new Package(14, 0.36, "Лоток"));
	    listProduct.add(new Product("C вишней", "Нежный пористый блинный лист наполняется вкусной и "
	    		+ "сочной начинкой и заворачивается в рулет.Продукт готов к употреблению, достаточно "
	    		+ "только разогреть.", stor, R.id.logo, listPackage));
        listPackage = new ArrayList<Package>();
        listPackage.add(new Package(14, 0.36, "Лоток"));
	    listProduct.add(new Product("С клубникой", "Нежный пористый блинный лист наполняется вкусной и "
	    		+ "сочной начинкой и заворачивается в рулет.Продукт готов к употреблению, достаточно "
	    		+ "только разогреть.", stor, R.id.logo, listPackage));
        listPackage = new ArrayList<Package>();
        pancakes.add(new Brand("Солнцепек (рулеты)", listProduct));
        listProduct = new ArrayList<Product>();
        //СОЛНЦЕПЕК(КОНВЕРТЫ)
        listPackage.add(new Package(12, 0.42, "Лоток"));
	    listProduct.add(new Product("С мясом", "Главный секрет этих блинов – щедрое количество начинки "
	    		+ "и нежная, пористая структура блинного листа. Продукт готов к употреблению, "
	    		+ "достаточно только разогреть.", stor, R.id.logo, listPackage));
        listPackage = new ArrayList<Package>();
        listPackage.add(new Package(12, 0.42, "Лоток"));
	    listProduct.add(new Product("С мясом и рисом", "Главный секрет этих блинов – щедрое количество начинки "
	    		+ "и нежная, пористая структура блинного листа. Продукт готов к употреблению, "
	    		+ "достаточно только разогреть.", stor, R.id.logo, listPackage));
        listPackage = new ArrayList<Package>();
        listPackage.add(new Package(12, 0.42, "Лоток"));
	    listProduct.add(new Product("С сыром и ветчиной", "Главный секрет этих блинов – щедрое количество начинки "
	    		+ "и нежная, пористая структура блинного листа. Продукт готов к употреблению, "
	    		+ "достаточно только разогреть.", stor, R.id.logo, listPackage));
        listPackage = new ArrayList<Package>();
        listPackage.add(new Package(12, 0.42, "Лоток"));
	    listProduct.add(new Product("С творогом", "Главный секрет этих блинов – щедрое количество начинки "
	    		+ "и нежная, пористая структура блинного листа. Продукт готов к употреблению, "
	    		+ "достаточно только разогреть.", stor, R.id.logo, listPackage));
        listPackage = new ArrayList<Package>();
        listPackage.add(new Package(12, 0.42, "Лоток"));
	    listProduct.add(new Product("Со сгущенным молоком", "Главный секрет этих блинов – щедрое количество начинки "
	    		+ "и нежная, пористая структура блинного листа. Продукт готов к употреблению, "
	    		+ "достаточно только разогреть.", stor, R.id.logo, listPackage));
        listPackage = new ArrayList<Package>();
        pancakes.add(new Brand("Солнцепек (конверты)", listProduct));
        listProduct = new ArrayList<Product>();
        //БЛИНЫ(БЕЗ НАЧИНКИ)
        listPackage.add(new Package(12, 0.42, "Лоток"));
	    listProduct.add(new Product("Солнцепек без начинки", "Пышный и нежный блинный лист.", stor,
	    		R.id.logo, listPackage));
        listPackage = new ArrayList<Package>();
        pancakes.add(new Brand("Солнцепек (без начинки)", listProduct));
	}
	
	
	public static void initPelmens() //Пельмени
	{
		List<Product> listProduct = new ArrayList<Product>();  
	    List<Package> listPackage = new ArrayList<Package>();
	    String stor = "Срок годности 180 суток при t – 18C"; 
	    //ВЕЛИКОСОЧНЫЕ
	    listPackage.add(new Package(8, 1, "пакет"));
	    listPackage.add(new Package(22, 0.5, "пакет"));
	    listProduct.add(new Product("Великосочные", "Сохраняют бульон внутри", stor, R.id.logo, listPackage));
        listPackage = new ArrayList<Package>();
        listPackage.add(new Package(22, 0.5, "пакет"));
        listProduct.add(new Product("Сытные", "Пельмени с сочным домашним фаршем", stor, R.id.logo, listPackage));
        listPackage = new ArrayList<Package>();
        listPackage.add(new Package(8, 1, "пакет"));
        listProduct.add(new Product("Хинкали", "Много сочного мяса", stor, R.id.logo, listPackage));
        listPackage = new ArrayList<Package>();
        pelmens.add(new Brand("Великосочные", listProduct));
        listProduct = new ArrayList<Product>();
        //ЕДИМ ДОМА
        listPackage.add(new Package(10, 0.9, "Пакет с клипсой"));
        listProduct.add(new Product("Едим Дома", "Пельмени такие, какими они должны быть: "
        		+ "тонкое нежное тесто с традиционной сочной мясной начинкой из свинины, говядины,"
        		+ " лука и перца." + "Пельмени обычного размера 10 гр. В пельменях много начинки: "
        		+ "55% фарша и 45% теста", stor, R.id.logo, listPackage));
        listPackage = new ArrayList<Package>();
        listPackage.add(new Package(10, 0.9, "Пакет с клипсой"));
	    listProduct.add(new Product("Едим Дома по-сибирски", "Мини-пельмени обычного размера 5 гр.В пельменях "
	    		+ "очень много начинки: 60% фарша и 40% теста", stor, R.id.logo, listPackage)); 
	    listPackage = new ArrayList<Package>();
	    pelmens.add(new Brand("Едим Дома", listProduct));
	    listProduct = new ArrayList<Product>();
	    //CМЕШАРИКИ
	    listPackage.add(new Package(10, 0.8, "Коробка"));
        listProduct.add(new Product("Смешарики", "Вкусные и полезные мини пельмени для детей и "
        		+ "взрослых. Пельмени состоят из натуральных ингредиентов с добавлением морской соли.",
        		stor, R.id.logo, listPackage));
        listPackage = new ArrayList<Package>();
        pelmens.add(new Brand("Смешарики", listProduct));
		listProduct = new ArrayList<Product>();
	    //ДОМАШНИЕ СЕКРЕТЫ
		listPackage.add(new Package(12, 0.95, "Пакет"));
	    listPackage.add(new Package(24, 0.45, "Пакет"));
	    listPackage.add(new Package(6, 0.8, "Лоток"));
	    listProduct.add(new Product("Домашние Секреты Домашние р/л", "Сочетание классической формы и "
	    		+ "традиционного фарша делают эти пельмени по домашнему вкусными.", stor, R.id.logo,
	    		listPackage));
	    listPackage = new ArrayList<Package>();
	    listPackage.add(new Package(10, 0.7, "Пакет"));
	    listProduct.add(new Product("Домашние Секреты Деликатесные р/л", "Являются миниатюрным аналогом"
	    		+ " пельменей «Домашние» ручной лепки", stor, R.id.logo, listPackage));
	    pelmens.add(new Brand("Домашние секреты", listProduct));
	    listProduct = new ArrayList<Product>();
	    listPackage = new ArrayList<Package>();
	    //МЯСНАЯ ЯРМАРКА
	    listPackage.add(new Package(6, 0.9, "Пакет"));
	    listProduct.add(new Product("Мясная Ярмарка Деревенские", "На основе говядины", stor, 
	    		R.id.logo, listPackage));
	    listPackage = new ArrayList<Package>();
	    listPackage.add(new Package(6, 0.9, "Пакет"));
	    listProduct.add(new Product("Мясная Ярмарка Застольные", "На основе свинины", stor, 
	    		R.id.logo, listPackage));
	    listPackage = new ArrayList<Package>();
	    listPackage.add(new Package(6, 0.8, "Пакет"));
	    listProduct.add(new Product("Мясная Ярмарка Сочные", "Сочные пельмени", stor, 
	    		R.id.logo, listPackage));
	    listPackage = new ArrayList<Package>();
	    listPackage.add(new Package(6, 0.9, "Пакет"));
	    listProduct.add(new Product("Мясная Ярмарка Поварята", "Мини пельмени на основе свинины и говядины", stor, 
	    		R.id.logo, listPackage));
	    listPackage = new ArrayList<Package>();
	    pelmens.add(new Brand("Мясная ярмарка", listProduct));
	    listProduct = new ArrayList<Product>();
	    //СИБИРСКИЙ ГУРМАН
	    listPackage.add(new Package(6, 0.5, "Пенал"));
	    listProduct.add(new Product("Элитные", "Ручная лепка и отборное сырье", stor, 
	    		R.id.logo, listPackage));
	    listPackage = new ArrayList<Package>();
	    listPackage.add(new Package(10, 0.72, "Лоток"));
	    listProduct.add(new Product("Манты", "Традиционный продукт уйгурской кухни", stor, 
	    		R.id.logo, listPackage));
	    listPackage = new ArrayList<Package>();
	    listPackage.add(new Package(10, 0.95, "Пакет"));
	    listPackage.add(new Package(12, 0.45, "Пакет"));
	    listProduct.add(new Product("Пельмени Для любимых  мужчин", "Сытный и питательный продукт. "
	    		+ "Состав начинки: 70% свинины, 30% говядины.", stor, R.id.logo, listPackage));
	    listPackage = new ArrayList<Package>();
	    listPackage.add(new Package(12, 0.95, "Пакет"));
	    listProduct.add(new Product("Cемейные", "Рецептура продукта обладает универсальным вкусом и "
	    		+ "подойдет для каждого члена семьи. Состав начинки: 70% говядины, 30% свинины.", stor, 
	    		R.id.logo, listPackage));
	    listPackage = new ArrayList<Package>();
	    listPackage.add(new Package(12, 0.95, "Пакет"));
	    listProduct.add(new Product("Домашние", "Состав начинки: 50% говядины, 50% свинины – давно "
	    		+ "привычный вкус с классическим сочетанием двух видов мяса.", stor, 
	    		R.id.logo, listPackage));
	    listPackage = new ArrayList<Package>();
	    pelmens.add(new Brand("Сибирский гурман", listProduct));
	    listProduct = new ArrayList<Product>();
	    //ЭКОНОМ
	    listPackage.add(new Package(6, 0.9, "Пакет"));
	    listProduct.add(new Product("Восточные", "Продукт предназначен для тех потребителей, которые"
	    		+ " предпочитают пельмени без свинины. ", stor, R.id.logo, listPackage));
	    listPackage = new ArrayList<Package>();
	    listPackage.add(new Package(10, 0.42, "Пакет"));
	    listPackage.add(new Package(12, 0.42, "Пакет"));
	    listProduct.add(new Product("Вкусный ужин", "Оптимальный продукт, сочетающий в себе высокую "
	    		+ "сытность и доступную стоимость.", stor, R.id.logo, listPackage));
	    listPackage = new ArrayList<Package>();
	    listPackage.add(new Package(10, 0.45, "Пакет"));
	    listPackage.add(new Package(8, 0.9, "Пакет"));
	    listProduct.add(new Product("Экстра", "Экономичный продукт особого способа лепки, как у "
	    		+ "домашних пельменей. Имеют маленький размер.", stor, R.id.logo, listPackage));
	    listPackage = new ArrayList<Package>();
	    pelmens.add(new Brand("Эконом", listProduct));
	}
}
