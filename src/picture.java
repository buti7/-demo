import javax.swing.*;

public class picture extends JFrame{

    public  void main(int num) {

        //引入图片
        ImageIcon image = new ImageIcon("./pngs/"+num+".png");
        JLabel imageLabel = new JLabel(image);
        //设置图片的位置和大小
        imageLabel.setBounds(700, 250, 800, 800);

        JFrame j = new JFrame();
        //设置标题
        j.setTitle("如图所示");
        //设置窗口的初试位置和大小
        j.setBounds(700, 250, 800, 800);
        //添加JLabel组件
        j.add(imageLabel);
        //JFrame可见
        j.setVisible(true);
    }

}

