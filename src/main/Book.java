package main;

import java.util.ArrayList;

public class Book {
	
	private int book_id;
	private int goodreads_book_id;
	private int best_book_id;
	private int work_id;
	private int books_count;
	private int isbn;
	private double isbn13;
	private String authors;
	private float original_publication_year;
	private String original_title;
	private String title;
	private String language_code;
	private float average_rating;
	private int ratings_count;
	private int work_ratings_count;
	private int work_text_reviews_count;
	private int ratings_1;
	private int ratings_2;
	private int ratings_3;
	private int ratings_4;
	private int ratings_5;
	private String image_url;
	private String small_image_url;
	
	
	
	
	public Book(ArrayList<String> items) {
		book_id = Integer.parseInt(items.get(0));
		goodreads_book_id = Integer.parseInt(items.get(1));
		best_book_id = Integer.parseInt(items.get(2));
		work_id = Integer.parseInt(items.get(3));
		books_count = Integer.parseInt(items.get(4));
		isbn = Integer.parseInt(items.get(5));
		isbn13 = Double.parseDouble(items.get(6));
		authors = items.get(7);
		original_publication_year = Float.parseFloat(items.get(8));
		original_title = items.get(9);
		title = items.get(10);
		language_code = items.get(11);
		average_rating = Float.parseFloat(items.get(12));
		ratings_count = Integer.parseInt(items.get(13));
		work_ratings_count = Integer.parseInt(items.get(14));
		work_text_reviews_count = Integer.parseInt(items.get(15));
		ratings_1 = Integer.parseInt(items.get(16));
		ratings_2 = Integer.parseInt(items.get(17));
		ratings_3 = Integer.parseInt(items.get(18));
		ratings_4 = Integer.parseInt(items.get(19));
		ratings_5 = Integer.parseInt(items.get(20));
		image_url = items.get(21);
		small_image_url = items.get(22);
	}
	

}
