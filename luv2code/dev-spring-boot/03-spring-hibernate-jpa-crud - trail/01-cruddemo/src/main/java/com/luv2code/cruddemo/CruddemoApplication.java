package com.luv2code.cruddemo;

//import com.luv2code.cruddemo.entity.Student;
import com.luv2code.cruddemo.DAO.FilmDAO;
import com.luv2code.cruddemo.entity.Film;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(FilmDAO film){
		return runner ->
		{
//			create(film);

			multiple(film);

			find(film);

			updatename(film);

			deleteId(film);
		};

	}



	private void create(FilmDAO filmdao) {
		Film film1=new Film("puneeth","radhika","rakshith");
		filmdao.createfilm(film1);

	}

	private void multiple(FilmDAO filmdao) {
		Film film1=new Film("raj","saipallavi","rishab");
		Film film2=new Film("ravi","pallavi","hat");
		Film film3=new Film("ram","seetha","laskman");

		filmdao.createmultiple(film1);
		filmdao.createmultiple(film2);
		filmdao.createmultiple(film3);

	}

	private void find(FilmDAO film) {
		int id=3;
		Film film1=film.findById(id);


		System.out.println(film1.getHero());
	}

	private void updatename(FilmDAO film) {
		int id=2;
		Film film1=film.findById(id);

		film1.sethero("Ramcharan");


		film.update(film1);



	}


	private void deleteId(FilmDAO film) {
		int id=1;
		film.delete(id);

	}
}
