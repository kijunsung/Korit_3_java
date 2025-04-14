package 정처기.싱글톤;

class Connection {

    private static Connection _inst = null;
    private int count = 0;

    //언제든지 존재하고, 어디서든 쓸 수 있는, Connection type의 객체를 반환하는, get()이라는 메소드다
    static public Connection get() {
        if(_inst == null) {
            _inst = new Connection();
            return _inst;
        }
        return _inst;
    }

    public void count() {
        count++;
    }

    public int getCount() {
        return count;
    }
}


public class Main {

    public static void main(String[] args) {

        Connection conn1 = Connection.get();
        conn1.count();

        Connection conn2 = Connection.get();
        conn2.count();

        Connection conn3 = Connection.get();
        conn3.count();

        conn1.count();  //_inst = new Connection();라는 같은 객체를 사용하기 때문에 
                        //conn1.count(); 를 하든 conn2.count();를 하든 같은 4가 나옴
        System.out.print(conn1.getCount());
    }

}
