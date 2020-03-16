package ru.avalon.java.dev.j10.labs.models;
import ru.avalon.java.dev.j10.labs.commons.*;

/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность,
 * наделённая:
 * <ol>
 *     <li>именем;
 *     <li>паспортными данными;
 *     <li>пропиской по месту жительства.
 * </ol>
 */
public class Person {

    /**
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то
     * возвращет Имя, Фимилию и Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то
     * возвращает Имя, Первую букву второго имени, и Фамилию,
     * разделённые пробелом. После Инициала второго имени
     * должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а
     * есть только Имя и Фамилия, то возвращает их, разделённые
     * пробелом.
     *
     * @return имя человека в виде строки.
     */
    public String getFullName(Passport passportOfPerson) {
        new Passport("", "", "");
        String fullName = passportOfPerson.getName() + " " + passportOfPerson.getPatronumic()+ " " +
                       passportOfPerson.getSurName();        
     return fullName;
    }

    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной
     * регистрации человека, согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */
    public String getAddress(Address personAddres) {
        new Address("", "", "", "", "", "", "");
        String add = personAddres.getCountry()  + ", " +  personAddres.getPostCode() + ", " +
                     personAddres.getRegion()  + ", " +  personAddres.getCity()  + ", " +
                     personAddres.getStreet()  + ", " +  personAddres.getHousesNumber() + ", " +  
                     personAddres.getFlatsNumber();
        
        return add;
    }
}