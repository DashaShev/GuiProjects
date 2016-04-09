/**
 *
 *  @author Shevchenko Dariia S14145
 *
 */

package zad1;


public abstract class Spiewak {
    static Integer sp_index = 0;
    private Integer my_num;
    private String name;
    private String song;

    public Spiewak(String name) {
        this.name = name;
        my_num += 1;
        this.sp_index = my_num;
    }

    static public String najglosniej(Spiewak[] sp) {
        return "Not Implemented";
    }
}
