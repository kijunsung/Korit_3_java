package org.example;

class Connection {

    private static Connection _inst = null; //자료형 Connection 변수명 _inst이 ㅅㅂ 없대
    private int count = 0;  //초기값 0

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


public class Jung {

    public static void main(String[] args) {

        Connection conn1 = Connection.get();
        conn1.count();

        Connection conn2 = Connection.get();
        conn2.count();

        Connection conn3 = Connection.get();
        conn3.count();

        conn1.count();
        System.out.print(conn1.getCount());
    }

}
