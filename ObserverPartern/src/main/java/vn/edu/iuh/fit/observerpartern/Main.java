package vn.edu.iuh.fit.observerpartern;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Stock và Investor
        Stock stock = new Stock();
        Investor investor1 = new Investor("Alice", stock);
        Investor investor2 = new Investor("Bob", stock);

        // Thay đổi giá cổ phiếu và thông báo cho các nhà đầu tư
        stock.setPrice("100 USD");
        stock.setPrice("120 USD");

        // Tạo đối tượng Task và TeamMember
        Task task = new Task();
        TeamMember member1 = new TeamMember("Charlie", task);
        TeamMember member2 = new TeamMember("Dave", task);

        // Thay đổi trạng thái công việc và thông báo cho các thành viên trong nhóm
        task.setStatus("In Progress");
        task.setStatus("Completed");
    }
}