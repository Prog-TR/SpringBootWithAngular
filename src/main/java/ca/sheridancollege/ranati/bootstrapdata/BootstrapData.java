package ca.sheridancollege.ranati.bootstrapdata;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ca.sheridancollege.ranati.beans.Stationery;
import ca.sheridancollege.ranati.beans.Teacher;
import ca.sheridancollege.ranati.repositories.StationeryRepository;
import ca.sheridancollege.ranati.repositories.TeacherRepository;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class BootstrapData implements CommandLineRunner {

	private TeacherRepository tRepo;
	private StationeryRepository sRepo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Teacher t1 = Teacher.builder().name("John").build();
		Teacher t2 = Teacher.builder().name("Stella").build();
		Teacher t3 = Teacher.builder().name("Arnold").build();
		
		tRepo.saveAll(Arrays.asList(t1, t2, t3));
		
		Stationery s1 = Stationery.builder().name("Pencil").price(56.78).quantity(23).employeeName("John").build();
		Stationery s2 = Stationery.builder().name("Marker").price(12.56).quantity(12).employeeName("Stella").build();
		Stationery s3 = Stationery.builder().name("Pen").price(78.45).quantity(63).employeeName("John").build();
		Stationery s4 = Stationery.builder().name("Ruler").price(44.78).quantity(43).employeeName("Arnold").build();
		Stationery s5 = Stationery.builder().name("Protactor").price(12.67).quantity(86).employeeName("Stella").build();
		Stationery s6 = Stationery.builder().name("NoteBook").price(99.99).quantity(43).employeeName("Arnold").build();
		Stationery s7 = Stationery.builder().name("Red Compass").price(3.21).quantity(16).employeeName("John").build();
		Stationery s8 = Stationery.builder().name("Binder").price(61.21).quantity(64).employeeName("Arnold").build();
		Stationery s9 = Stationery.builder().name("Folder").price(76.31).quantity(95).employeeName("Stella").build();
		Stationery s10 = Stationery.builder().name("Eraser").price(79.14).quantity(62).employeeName("John").build();
		
		sRepo.saveAll(Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10));
	}

}
