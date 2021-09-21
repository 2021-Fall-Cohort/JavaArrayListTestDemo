import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class ArrayListAppTest {


    ArrayListApp underTest;
    Cat fluffy;
    @BeforeEach
    void setUp() {
        fluffy = new Cat("Fluffy");
        underTest = new ArrayListApp();
    }
    @Test
    void shouldCreateClassAndAddToArrayList(){

        underTest.addCat(fluffy);
        assertEquals("Fluffy",underTest.getCats().get(0).getName());
    }
    //Write a test to check whether or not something has been added to the ArrayList!
    @Test
    void shouldIncreaseSizeWhenObjectAddedToArrayList(){
        //Cat fluffy = new Cat("Fluffy");
        underTest.shelterList().add(fluffy);
        int sizeOfArrayList = underTest.shelterList().size();
        assertEquals(1,sizeOfArrayList);
    }
    //Write a test to check whether or not you can retrieve the correct element from a ArrayList using its index!
    @Test
    void shouldReturnElementUsingIndex(){
        Cat fluffy = new Cat("Fluffy");
        Cat annoying = new Cat("Annoying");
        Cat max = new Cat("Max");
        underTest.shelterList().add(fluffy);
        underTest.shelterList().add(annoying);
        underTest.shelterList().add(max);
        assertEquals("Annoying",underTest.shelterList().get(1).getName());
    }
    //Write a test to check whether or not you can change an element in the ArrayList!
    @Test
    void shouldChangeElementInArrayList(){
        Cat fluffy = new Cat("Fluffy");
        underTest.shelterList().add(fluffy);
        underTest.shelterList().get(0).updateName("Fluffier");
        fluffy.updateName("Fluffier");
        assertEquals("Fluffier", underTest.shelterList().get(0).getName());
    }
    //Write a test to check whether or not you can remove an element from the ArrayList!
    @Test
    void shouldRemoveElementFromArrayList(){
        Cat fluffy = new Cat("Fluffy");
        Cat annoying = new Cat("Annoying");
        Cat max = new Cat("Max");
        underTest.shelterList().add(fluffy);
        underTest.shelterList().add(annoying);
        underTest.shelterList().add(max);
        underTest.shelterList().remove(fluffy);
        int sizeOfArrayList = underTest.shelterList().size();
        assertEquals(2,sizeOfArrayList);
    }
    //Write a test to check whether or not you can remove all elements from the ArrayList!
    @Test
    void shouldRemoveAllElementsWhenCleared(){
        Cat fluffy = new Cat("Fluffy");
        Cat annoying = new Cat("Annoying");
        Cat max = new Cat("Max");
        underTest.shelterList().add(fluffy);
        underTest.shelterList().add(annoying);
        underTest.shelterList().add(max);
        underTest.shelterList().clear();
        int sizeOfArrayList = underTest.shelterList().size();
        assertEquals(0,sizeOfArrayList);
    }
    //Write a test to check whether or not you can check the size of the ArrayList!
    @Test
    void shouldReturnSizeofArrayList(){
        Cat fluffy = new Cat("Fluffy");
        int initSizeOfArray = underTest.shelterList().size();
        underTest.shelterList().add(fluffy);
        int sizeOfArray = underTest.shelterList().size();
        assertEquals(1, sizeOfArray-initSizeOfArray);

    }
}
