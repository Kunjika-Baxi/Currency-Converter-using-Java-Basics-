import java.util.Scanner;
public class Currency_Converter
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int ch,ans;//Currency Rate in June 2024
        System.out.println("\t-----Currency Converter-----");
        System.out.println("\nEnter the type of Currency which you want to Convert :");
        System.out.println("1. Australian Dollar\n2. British Pound\n3. Canadian Dollar\n4. Euro\n5. Hong-Kong Dollar\n6. Indian Rupee\n7. Japanese Yen\n8. Kuwaiti Dinar");
        System.out.println("9. Singapore Dollar\n10. South African Rand\n11. Swiss Franc\n12. U.A.E. Dirham\n13. U.S. Dollar");
        System.out.println("\nEnter Your Choice : ");
        ch=sc.nextInt();
        System.out.println("\nEnter the type of Currency in which you want to Convert :");
        System.out.println("1. Australian Dollar\n2. British Pound\n3. Canadian Dollar\n4. Euro\n5. Hong-Kong Dollar\n6. Indian Rupee\n7. Japanese Yen\n8. Kuwaiti Dinar");
        System.out.println("9. Singapore Dollar\n10. South African Rand\n11. Swiss Franc\n12. U.A.E. Dirham\n13. U.S. Dollar");
        System.out.println("\nEnter Your Choice : ");
        ans=sc.nextInt();
        if(ch==1 && ans==2)
        {
            double rs;
            System.out.println("\nEnter Amount in Australian Dollar : ");
            rs=sc.nextDouble();
            rs=rs*0.52;
            System.out.println("\nBritish Pound : "+rs);
        }
        else if(ch==1 && ans==3)
        {
            double rs;
            System.out.println("\nEnter Amount in Australian Dollar : ");
            rs=sc.nextDouble();
            rs=rs*0.91;
            System.out.println("\nCanadian Dollar : "+rs);
        }
        else if(ch==1 && ans==4)
        {
            double rs;
            System.out.println("\nEnter Amount in Australian Dollar : ");
            rs=sc.nextDouble();
            rs=rs*0.62;
            System.out.println("\nEuro : "+rs);
        }
        else if(ch==1 && ans==5)
        {
            double rs;
            System.out.println("\nEnter Amount in Australian Dollar : ");
            rs=sc.nextDouble();
            rs=rs*5.16;
            System.out.println("\nHong-Kong Dollar : "+rs);
        }
        else if(ch==1 && ans==6)
        {
            double rs;
            System.out.println("\nEnter Amount in Australian Dollar : ");
            rs=sc.nextDouble();
            rs=rs*55.18;
            System.out.println("\nIndian Rupee : "+rs);
        }
        else if(ch==1 && ans==7)
        {
            double rs;
            System.out.println("\nEnter Amount in Australian Dollar : ");
            rs=sc.nextDouble();
            rs=rs*104.57;
            System.out.println("\nJapanese Yen : "+rs);
        }
        else if(ch==1 && ans==8)
        {
            double rs;
            System.out.println("\nEnter Amount in Australian Dollar : ");
            rs=sc.nextDouble();
            rs=rs*0.20;
            System.out.println("\nKuwaiti Dinar : "+rs);
        }
        else if(ch==1 && ans==9)
        {
            double rs;
            System.out.println("\nEnter Amount in Australian Dollar : ");
            rs=sc.nextDouble();
            rs=rs*0.90;
            System.out.println("\nSingapore Dollar : "+rs);
        }
        else if(ch==1 && ans==10)
        {
            double rs;
            System.out.println("\nEnter Amount in Australian Dollar : ");
            rs=sc.nextDouble();
            rs=rs*12.00;
            System.out.println("\nSouth African Rand : "+rs);
        }
        else if(ch==1 && ans==11)
        {
            double rs;
            System.out.println("\nEnter Amount in Australian Dollar : ");
            rs=sc.nextDouble();
            rs=rs*0.59;
            System.out.println("\nSwiss Franc : "+rs);
        }
        else if(ch==1 && ans==13)
        {
            double rs;
            System.out.println("\nEnter Amount in Australian Dollar : ");
            rs=sc.nextDouble();
            rs=rs*0.66;
            System.out.println("\nU.S. Dollar : "+rs);
        }
        else if(ch==1 && ans==12)
        {
            double rs;
            System.out.println("\nEnter Amount in Australian Dollar : ");
            rs=sc.nextDouble();
            rs=rs*2.43;
            System.out.println("\nU.A.E. Dirham : "+rs);
        }
        else if(ch==2 && ans==1)
        {
            double rs;
            System.out.println("\nEnter Amount in British Pound : ");
            rs=sc.nextDouble();
            rs=rs*1.92;
            System.out.println("\nAustralian Dollar : "+rs);
        }
        else if(ch==2 && ans==3)
        {
            double rs;
            System.out.println("\nEnter Amount in British Pound : ");
            rs=sc.nextDouble();
            rs=rs*1.74;
            System.out.println("\nCanadian Dollar : "+rs);
        }
        else if(ch==2 && ans==4)
        {
            double rs;
            System.out.println("\nEnter Amount in British Pound : ");
            rs=sc.nextDouble();
            rs=rs*1.18;
            System.out.println("\nEuro : "+rs);
        }
        else if(ch==2 && ans==5)
        {
            double rs;
            System.out.println("\nEnter Amount in British Pound : ");
            rs=sc.nextDouble();
            rs=rs*9.90;
            System.out.println("\nHong-Kong Dollar : "+rs);
        }
        else if(ch==2 && ans==6)
        {
            double rs;
            System.out.println("\nEnter Amount in British Pound : ");
            rs=sc.nextDouble();
            rs=rs*105.82;
            System.out.println("\nIndian Rupee : "+rs);
        }
        else if(ch==2 && ans==7)
        {
            double rs;
            System.out.println("\nEnter Amount in British Pound : ");
            rs=sc.nextDouble();
            rs=rs*200.57;
            System.out.println("\nJapanese Yen : "+rs);
        }
        else if(ch==2 && ans==8)
        {
            double rs;
            System.out.println("\nEnter Amount in British Pound : ");
            rs=sc.nextDouble();
            rs=rs*0.39;
            System.out.println("\nKuwaiti Dinar : "+rs);
        }
        else if(ch==2 && ans==9)
        {
            double rs;
            System.out.println("\nEnter Amount in British Pound : ");
            rs=sc.nextDouble();
            rs=rs*1.72;
            System.out.println("\nSingapore Dollar : "+rs);
        }
        else if(ch==2 && ans==10)
        {
            double rs;
            System.out.println("\nEnter Amount in British Pound : ");
            rs=sc.nextDouble();
            rs=rs*22.98;
            System.out.println("\nSouth African Rand : "+rs);
        }
        else if(ch==2 && ans==11)
        {
            double rs;
            System.out.println("\nEnter Amount in British Pound : ");
            rs=sc.nextDouble();
            rs=rs*1.13;
            System.out.println("\nSwiss Franc : "+rs);
        }
        else if(ch==2 && ans==13)
        {
            double rs;
            System.out.println("\nEnter Amount in British Pound : ");
            rs=sc.nextDouble();
            rs=rs*1.27;
            System.out.println("\nU.S. Dollar : "+rs);
        }
        else if(ch==2 && ans==12)
        {
            double rs;
            System.out.println("\nEnter Amount in British Pound : ");
            rs=sc.nextDouble();
            rs=rs*4.66;
            System.out.println("\nU.A.E. Dirham : "+rs);
        }
        else if(ch==3 && ans==1)
        {
            double rs;
            System.out.println("\nEnter Amount in Canadian Dollar : ");
            rs=sc.nextDouble();
            rs=rs*1.10;
            System.out.println("\nAustralian Dollar : "+rs);
        }
         else if(ch==3 && ans==2)
        {
            double rs;
            System.out.println("\nEnter Amount in Canadian Dollar : ");
            rs=sc.nextDouble();
            rs=rs*0.57;
            System.out.println("\nBritish Pound : "+rs);
        }
         else if(ch==3 && ans==4)
        {
            double rs;
            System.out.println("\nEnter Amount in Canadian Dollar : ");
            rs=sc.nextDouble();
            rs=rs*0.68;
            System.out.println("\nEuro : "+rs);
        }
         else if(ch==3 && ans==5)
        {
            double rs;
            System.out.println("\nEnter Amount in Canadian Dollar : ");
            rs=sc.nextDouble();
            rs=rs*5.69;
            System.out.println("\nHong-Kong Dollar : "+rs);
        }
         else if(ch==3 && ans==6)
        {
            double rs;
            System.out.println("\nEnter Amount in Canadian Dollar : ");
            rs=sc.nextDouble();
            rs=rs*60.75;
            System.out.println("\nIndian Rupee : "+rs);
        }
         else if(ch==3 && ans==7)
        {
            double rs;
            System.out.println("\nEnter Amount in Canadian Dollar : ");
            rs=sc.nextDouble();
            rs=rs*115.02;
            System.out.println("\nJapanese Yen : "+rs);
        }
         else if(ch==3 && ans==8)
        {
            double rs;
            System.out.println("\nEnter Amount in Canadian Dollar : ");
            rs=sc.nextDouble();
            rs=rs*0.22;
            System.out.println("\nKuwaiti Dinar : "+rs);
        }
         else if(ch==3 && ans==9)
        {
            double rs;
            System.out.println("\nEnter Amount in Canadian Dollar : ");
            rs=sc.nextDouble();
            rs=rs*0.98;
            System.out.println("\nSingapore Dollar : "+rs);
        }
         else if(ch==3 && ans==10)
        {
            double rs;
            System.out.println("\nEnter Amount in Canadian Dollar : ");
            rs=sc.nextDouble();
            rs=rs*13.15;
            System.out.println("\nSouth African Rand : "+rs);
        }
         else if(ch==3 && ans==11)
        {
            double rs;
            System.out.println("\nEnter Amount in Canadian Dollar : ");
            rs=sc.nextDouble();
            rs=rs*0.64;
            System.out.println("\nSwiss Franc : "+rs);
        }
         else if(ch==3 && ans==12)
        {
            double rs;
            System.out.println("\nEnter Amount in Canadian Dollar : ");
            rs=sc.nextDouble();
            rs=rs*2.68;
            System.out.println("\nU.A.E. Dirham : "+rs);
        }
         else if(ch==3 && ans==13)
        {
            double rs;
            System.out.println("\nEnter Amount in Canadian Dollar : ");
            rs=sc.nextDouble();
            rs=rs*0.73;
            System.out.println("\nU.S. Dollar : "+rs);
        }
        else if(ch==4 && ans==1)
        {
            double rs;
            System.out.println("\nEnter Amount in Euro : ");
            rs=sc.nextDouble();
            rs=rs*1.61;
            System.out.println("\nAustralian Dollar : "+rs);
        }
        else if(ch==4 && ans==2)
        {
            double rs;
            System.out.println("\nEnter Amount in Euro : ");
            rs=sc.nextDouble();
            rs=rs*0.85;
            System.out.println("\nBritish Pound : "+rs);
        }
        else if(ch==4 && ans==3)
        {
            double rs;
            System.out.println("\nEnter Amount in Euro : ");
            rs=sc.nextDouble();
            rs=rs*1.47;
            System.out.println("\nCanadian Dollar : "+rs);
        }
        else if(ch==4 && ans==5)
        {
            double rs;
            System.out.println("\nEnter Amount in Euro : ");
            rs=sc.nextDouble();
            rs=rs*8.38;
            System.out.println("\nHong-Kong Dollar : "+rs);
        }
        else if(ch==4 && ans==6)
        {
            double rs;
            System.out.println("\nEnter Amount in Euro : ");
            rs=sc.nextDouble();
            rs=rs*89.47;
            System.out.println("\nIndian Rupee : "+rs);
        }
        else if(ch==4 && ans==7)
        {
            double rs;
            System.out.println("\nEnter Amount in Euro : ");
            rs=sc.nextDouble();
            rs=rs*169.47;
            System.out.println("\nJapanese Yen : "+rs);
        }
        else if(ch==4 && ans==8)
        {
            double rs;
            System.out.println("\nEnter Amount in Euro : ");
            rs=sc.nextDouble();
            rs=rs*0.33;
            System.out.println("\nKuwaiti Dinar : "+rs);
        }
        else if(ch==4 && ans==9)
        {
            double rs;
            System.out.println("\nEnter Amount in Euro : ");
            rs=sc.nextDouble();
            rs=rs*1.45;
            System.out.println("\nSingapore Dollar : "+rs);
        }
        else if(ch==4 && ans==10)
        {
            double rs;
            System.out.println("\nEnter Amount in Euro : ");
            rs=sc.nextDouble();
            rs=rs*19.38;
            System.out.println("\nSouth African Rand : "+rs);
        }
        else if(ch==4 && ans==11)
        {
            double rs;
            System.out.println("\nEnter Amount in Euro : ");
            rs=sc.nextDouble();
            rs=rs*0.95;
            System.out.println("\nSwiss Franc : "+rs);
        }
        else if(ch==4 && ans==12)
        {
            double rs;
            System.out.println("\nEnter Amount in Euro : ");
            rs=sc.nextDouble();
            rs=rs*3.94;
            System.out.println("\nU.A.E. Dirham : "+rs);
        }
        else if(ch==4 && ans==13)
        {
            double rs;
            System.out.println("\nEnter Amount in Euro : ");
            rs=sc.nextDouble();
            rs=rs*1.07;
            System.out.println("\nU.S. Dollar : "+rs);
        }
        else if(ch==5 && ans==1)
        {
            double rs;
            System.out.println("\nEnter Amount in Hong-Kong Dollar : ");
            rs=sc.nextDouble();
            rs=rs*0.19;
            System.out.println("\nAustralian Dollar : "+rs);
        }
         else if(ch==5 && ans==2)
        {
            double rs;
            System.out.println("\nEnter Amount in Hong-Kong Dollar : ");
            rs=sc.nextDouble();
            rs=rs*0.10;
            System.out.println("\nBritish Pound : "+rs);
        }
         else if(ch==5 && ans==3)
        {
            double rs;
            System.out.println("\nEnter Amount in Hong-Kong Dollar : ");
            rs=sc.nextDouble();
            rs=rs*0.18;
            System.out.println("\nCanandian Dollar : "+rs);
        }
         else if(ch==5 && ans==4)
        {
            double rs;
            System.out.println("\nEnter Amount in Hong-Kong Dollar : ");
            rs=sc.nextDouble();
            rs=rs*0.12;
            System.out.println("\nEuro : "+rs);
        }
         else if(ch==5 && ans==6)
        {
            double rs;
            System.out.println("\nEnter Amount in Hong-Kong Dollar : ");
            rs=sc.nextDouble();
            rs=rs*10.71;
            System.out.println("\nIndian Rupee : "+rs);
        }
         else if(ch==5 && ans==7)
        {
            double rs;
            System.out.println("\nEnter Amount in Hong-Kong Dollar : ");
            rs=sc.nextDouble();
            rs=rs*20.36;
            System.out.println("\nJapanese Yen : "+rs);
        }
         else if(ch==5 && ans==8)
        {
            double rs;
            System.out.println("\nEnter Amount in Hong-Kong Dollar : ");
            rs=sc.nextDouble();
            rs=rs*0.039;
            System.out.println("\nKuwaiti Dinar : "+rs);
        }
         else if(ch==5 && ans==9)
        {
            double rs;
            System.out.println("\nEnter Amount in Hong-Kong Dollar : ");
            rs=sc.nextDouble();
            rs=rs*0.17;
            System.out.println("\nSingapore Dollar : "+rs);
        }
         else if(ch==5 && ans==10)
        {
            double rs;
            System.out.println("\nEnter Amount in Hong-Kong Dollar : ");
            rs=sc.nextDouble();
            rs=rs*2.31;
            System.out.println("\nSouth African Rand : "+rs);
        }
         else if(ch==5 && ans==11)
        {
            double rs;
            System.out.println("\nEnter Amount in Hong-Kong Dollar : ");
            rs=sc.nextDouble();
            rs=rs*0.11;
            System.out.println("\nSwiss Franc : "+rs);
        }
         else if(ch==5 && ans==12)
        {
            double rs;
            System.out.println("\nEnter Amount in Hong-Kong Dollar : ");
            rs=sc.nextDouble();
            rs=rs*0.47;
            System.out.println("\nU.A.E. Dirham : "+rs);
        }
         else if(ch==5 && ans==13)
        {
            double rs;
            System.out.println("\nEnter Amount in Hong-Kong Dollar : ");
            rs=sc.nextDouble();
            rs=rs*0.13;
            System.out.println("\nU.S. Dollar : "+rs);
        }
         else if(ch==6 && ans==1)
        {
            double rs;
            System.out.println("\nEnter Amount in Indian Rupee : ");
            rs=sc.nextDouble();
            rs=rs*0.018;
            System.out.println("\nAustralian Dollar : "+rs);
        }
        else if(ch==6 && ans==2)
        {
            double rs;
            System.out.println("\nEnter Amount in Indian Rupee : ");
            rs=sc.nextDouble();
            rs=rs*0.0095;
            System.out.println("\nBritish Pound : "+rs);
        }
        else if(ch==6 && ans==3)
        {
            double rs;
            System.out.println("\nEnter Amount in Indian Rupee : ");
            rs=sc.nextDouble();
            rs=rs*0.016;
            System.out.println("\nCanadian Dollar : "+rs);
        }
        else if(ch==6 && ans==4)
        {
            double rs;
            System.out.println("\nEnter Amount in Indian Rupee : ");
            rs=sc.nextDouble();
            rs=rs*0.011;
            System.out.println("\nEuro : "+rs);
        }
        else if(ch==6 && ans==5)
        {
            double rs;
            System.out.println("\nEnter Amount in Indian Rupee : ");
            rs=sc.nextDouble();
            rs=rs*0.093;
            System.out.println("\nHong-Kong Dollar : "+rs);
        }
        else if(ch==6 && ans==13)
        {
            double rs;
            System.out.println("\nEnter Amount in Indian Rupee : ");
            rs=sc.nextDouble();
            rs=rs*0.012;
            System.out.println("\nU.S. Dollar : "+rs);
        }
        else if(ch==6 && ans==7)
        {
            double rs;
            System.out.println("\nEnter Amount in Indian Rupee : ");
            rs=sc.nextDouble();
            rs=rs*1.90;
            System.out.println("\nJapanese Yen : "+rs);
        }
        else if(ch==6 && ans==8)
        {
            double rs;
            System.out.println("\nEnter Amount in Indian Rupee : ");
            rs=sc.nextDouble();
            rs=rs*0.0037;
            System.out.println("\nKuwaiti Dinar : "+rs);
        }
        else if(ch==6 && ans==9)
        {
            double rs;
            System.out.println("\nEnter Amount in Indian Rupee : ");
            rs=sc.nextDouble();
            rs=rs*0.016;
            System.out.println("\nSingapore Dollar : "+rs);
        }
        else if(ch==6 && ans==10)
        {
            double rs;
            System.out.println("\nEnter Amount in Indian Rupee : ");
            rs=sc.nextDouble();
            rs=rs*0.22;
            System.out.println("\nSouth African Rand : "+rs);
        }
        else if(ch==6 && ans==11)
        {
            double rs;
            System.out.println("\nEnter Amount in Indian Rupee : ");
            rs=sc.nextDouble();
            rs=rs*0.011;
            System.out.println("\nSwiss Franc : "+rs);
        }
        else if(ch==6 && ans==12)
        {
            double rs;
            System.out.println("\nEnter Amount in Indian Rupee : ");
            rs=sc.nextDouble();
            rs=rs*0.044;
            System.out.println("\nU.A.E. Dirham : "+rs);
        }
        else if(ch==7 && ans==1)
        {
            double rs;
            System.out.println("\nEnter Amount in Japanese Yen : ");
            rs=sc.nextDouble();
            rs=rs*0.0095;
            System.out.println("\nAustralian Dollar : "+rs);
        }
        else if(ch==7 && ans==2)
        {
            double rs;
            System.out.println("\nEnter Amount in Japanese Yen : ");
            rs=sc.nextDouble();
            rs=rs*0.0050;
            System.out.println("\nBritish Pound : "+rs);
        }
        else if(ch==7 && ans==3)
        {
            double rs;
            System.out.println("\nEnter Amount in Japanese Yen : ");
            rs=sc.nextDouble();
            rs=rs*0.0086;
            System.out.println("\nCanadian Dollar : "+rs);
        }
        else if(ch==7 && ans==4)
        {
            double rs;
            System.out.println("\nEnter Amount in Japanese Yen : ");
            rs=sc.nextDouble();
            rs=rs*0.0059;
            System.out.println("\nEuro : "+rs);
        }
        else if(ch==7 && ans==5)
        {
            double rs;
            System.out.println("\nEnter Amount in Japanese Yen : ");
            rs=sc.nextDouble();
            rs=rs*0.049;
            System.out.println("\nHong-Kong Dollar : "+rs);
        }
        else if(ch==7 && ans==6)
        {
            double rs;
            System.out.println("\nEnter Amount in Japanese Yen : ");
            rs=sc.nextDouble();
            rs=rs*0.53;
            System.out.println("\nIndian Rupee : "+rs);
        }
        else if(ch==7 && ans==8)
        {
            double rs;
            System.out.println("\nEnter Amount in Japanese Yen : ");
            rs=sc.nextDouble();
            rs=rs*0.0019;
            System.out.println("\nKuwaiti Dinar : "+rs);
        }
        else if(ch==7 && ans==9)
        {
            double rs;
            System.out.println("\nEnter Amount in Japanese Yen : ");
            rs=sc.nextDouble();
            rs=rs*0.0085;
            System.out.println("\nSingapore Dollar : "+rs);
        }
        else if(ch==7 && ans==10)
        {
            double rs;
            System.out.println("\nEnter Amount in Japanese Yen : ");
            rs=sc.nextDouble();
            rs=rs*0.11;
            System.out.println("\nSouth African Rand : "+rs);
        }
        else if(ch==7 && ans==11)
        {
            double rs;
            System.out.println("\nEnter Amount in Japanese Yen : ");
            rs=sc.nextDouble();
            rs=rs*0.0056;
            System.out.println("\nSwiss Franc : "+rs);
        }
        else if(ch==7 && ans==12)
        {
            double rs;
            System.out.println("\nEnter Amount in Japanese Yen : ");
            rs=sc.nextDouble();
            rs=rs*0.023;
            System.out.println("\nU.A.E. Dirham : "+rs);
        }
        else if(ch==7 && ans==13)
        {
            double rs;
            System.out.println("\nEnter Amount in Japanese Yen : ");
            rs=sc.nextDouble();
            rs=rs*0.0063;
            System.out.println("\nU.S. Dollar : "+rs);
        }
        else if(ch==8 && ans==1)
        {
            double rs;
            System.out.println("\nEnter Amount in Kuwaiti Dinar : ");
            rs=sc.nextDouble();
            rs=rs*4.88;
            System.out.println("\nAustralian Dollar : "+rs);
        }
        else if(ch==8 && ans==2)
        {
            double rs;
            System.out.println("\nEnter Amount in Kuwaiti Dinar : ");
            rs=sc.nextDouble();
            rs=rs*2.58;
            System.out.println("\nBritish Pound : "+rs);
        }
        else if(ch==8 && ans==3)
        {
            double rs;
            System.out.println("\nEnter Amount in Kuwaiti Dinar : ");
            rs=sc.nextDouble();
            rs=rs*4.47;
            System.out.println("\nCanadian Dollar : "+rs);
        }
        else if(ch==8 && ans==4)
        {
            double rs;
            System.out.println("\nEnter Amount in Kuwaiti Dinar : ");
            rs=sc.nextDouble();
            rs=rs*3.05;
            System.out.println("\nEuro : "+rs);
        }
        else if(ch==8 && ans==5)
        {
            double rs;
            System.out.println("\nEnter Amount in Kuwaiti Dinar : ");
            rs=sc.nextDouble();
            rs=rs*25.47;
            System.out.println("\nHong-Kong Dollar : "+rs);
        }
        else if(ch==8 && ans==6)
        {
            double rs;
            System.out.println("\nEnter Amount in Kuwaiti Dinar : ");
            rs=sc.nextDouble();
            rs=rs*272.70;
            System.out.println("\nIndian Rupee : "+rs);
        }
        else if(ch==8 && ans==7)
        {
            double rs;
            System.out.println("\nEnter Amount in Kuwaiti Dinar : ");
            rs=sc.nextDouble();
            rs=rs*521.21;
            System.out.println("\nJapanese Yen : "+rs);
        }
        else if(ch==8 && ans==9)
        {
            double rs;
            System.out.println("\nEnter Amount in Kuwaiti Dinar : ");
            rs=sc.nextDouble();
            rs=rs*4.42;
            System.out.println("\nSingapore Dollar : "+rs);
        }
        else if(ch==8 && ans==10)
        {
            double rs;
            System.out.println("\nEnter Amount in Kuwaiti Dinar : ");
            rs=sc.nextDouble();
            rs=rs*58.62;
            System.out.println("\nSouth African Rand : "+rs);
        }
        else if(ch==8 && ans==11)
        {
            double rs;
            System.out.println("\nEnter Amount in Kuwaiti Dinar : ");
            rs=sc.nextDouble();
            rs=rs*2.92;
            System.out.println("\nSwiss Franc : "+rs);
        }
        else if(ch==8 && ans==12)
        {
            double rs;
            System.out.println("\nEnter Amount in Kuwaiti Dinar : ");
            rs=sc.nextDouble();
            rs=rs*11.97;
            System.out.println("\nU.A.E. Dirham : "+rs);
        }
        else if(ch==8 && ans==13)
        {
            double rs;
            System.out.println("\nEnter Amount in Kuwaiti Dinar : ");
            rs=sc.nextDouble();
            rs=rs*3.26;
            System.out.println("\nU.S. Dollar : "+rs);
        }
        else if(ch==9 && ans==1)
        {
            double rs;
            System.out.println("\nEnter Amount in Singapore Dollar : ");
            rs=sc.nextDouble();
            rs=rs*1.10;
            System.out.println("\nAustralian Dollar : "+rs);
        }
        else if(ch==9 && ans==2)
        {
            double rs;
            System.out.println("\nEnter Amount in Singapore Dollar : ");
            rs=sc.nextDouble();
            rs=rs*0.58;
            System.out.println("\nBritish Pound : "+rs);
        }
        else if(ch==9 && ans==3)
        {
            double rs;
            System.out.println("\nEnter Amount in Singapore Dollar : ");
            rs=sc.nextDouble();
            rs=rs*1.01;
            System.out.println("\nCanadian Dollar : "+rs);
        }
        else if(ch==9 && ans==4)
        {
            double rs;
            System.out.println("\nEnter Amount in Singapore Dollar : ");
            rs=sc.nextDouble();
            rs=rs*0.69;
            System.out.println("\nEuro : "+rs);
        }
        else if(ch==9 && ans==5)
        {
            double rs;
            System.out.println("\nEnter Amount in Singapore Dollar : ");
            rs=sc.nextDouble();
            rs=rs*5.76;
            System.out.println("\nHong-Kong Dollar : "+rs);
        }
        else if(ch==9 && ans==6)
        {
            double rs;
            System.out.println("\nEnter Amount in Singapore Dollar : ");
            rs=sc.nextDouble();
            rs=rs*61.66;
            System.out.println("\nIndian Rupee : "+rs);
        }
        else if(ch==9 && ans==7)
        {
            double rs;
            System.out.println("\nEnter Amount in Singapore Dollar : ");
            rs=sc.nextDouble();
            rs=rs*117.85;
            System.out.println("\nJapanese Yen : "+rs);
        }
        else if(ch==9 && ans==8)
        {
            double rs;
            System.out.println("\nEnter Amount in Singapore Dollar : ");
            rs=sc.nextDouble();
            rs=rs*0.23;
            System.out.println("\nKuwaiti Dinar : "+rs);
        }
        else if(ch==9 && ans==10)
        {
            double rs;
            System.out.println("\nEnter Amount in Singapore Dollar : ");
            rs=sc.nextDouble();
            rs=rs*13.26;
            System.out.println("\nSouth African Rand : "+rs);
        }
        else if(ch==9 && ans==11)
        {
            double rs;
            System.out.println("\nEnter Amount in Singapore Dollar : ");
            rs=sc.nextDouble();
            rs=rs*0.66;
            System.out.println("\nSwiss Franc : "+rs);
        }
        else if(ch==9 && ans==12)
        {
            double rs;
            System.out.println("\nEnter Amount in Singapore Dollar : ");
            rs=sc.nextDouble();
            rs=rs*2.71;
            System.out.println("\nU.A.E. Dirham : "+rs);
        }
        else if(ch==9 && ans==13)
        {
            double rs;
            System.out.println("\nEnter Amount in Singapore Dollar : ");
            rs=sc.nextDouble();
            rs=rs*0.74;
            System.out.println("\nU.S. Dollar : "+rs);
        }
        else if(ch==10 && ans==1)
        {
            double rs;
            System.out.println("\nEnter Amount in South African Rand : ");
            rs=sc.nextDouble();
            rs=rs*0.083;
            System.out.println("\nAustralian Dollar : "+rs);
        }
        else if(ch==10 && ans==2)
        {
            double rs;
            System.out.println("\nEnter Amount in South African Rand : ");
            rs=sc.nextDouble();
            rs=rs*0.044;
            System.out.println("\nBritish Pound : "+rs);
        }
        else if(ch==10 && ans==3)
        {
            double rs;
            System.out.println("\nEnter Amount in South African Rand : ");
            rs=sc.nextDouble();
            rs=rs*0.076;
            System.out.println("\nCanadian Dollar : "+rs);
        }
        else if(ch==10 && ans==4)
        {
            double rs;
            System.out.println("\nEnter Amount in South African Rand : ");
            rs=sc.nextDouble();
            rs=rs*0.052;
            System.out.println("\nEuro : "+rs);
        }
        else if(ch==10 && ans==5)
        {
            double rs;
            System.out.println("\nEnter Amount in South African Rand : ");
            rs=sc.nextDouble();
            rs=rs*0.43;
            System.out.println("\nHong-Kong Dollar : "+rs);
        }
        else if(ch==10 && ans==6)
        {
            double rs;
            System.out.println("\nEnter Amount in South African Rand : ");
            rs=sc.nextDouble();
            rs=rs*4.65;
            System.out.println("\nIndian Rupee : "+rs);
        }
        else if(ch==10 && ans==7)
        {
            double rs;
            System.out.println("\nEnter Amount in South African Rand : ");
            rs=sc.nextDouble();
            rs=rs*8.89;
            System.out.println("\nJapanese Yen : "+rs);
        }
        else if(ch==10 && ans==8)
        {
            double rs;
            System.out.println("\nEnter Amount in South African Rand : ");
            rs=sc.nextDouble();
            rs=rs*0.017;
            System.out.println("\nKuwaiti Dinar : "+rs);
        }
        else if(ch==10 && ans==9)
        {
            double rs;
            System.out.println("\nEnter Amount in South African Rand : ");
            rs=sc.nextDouble();
            rs=rs*0.075;
            System.out.println("\nSingapore Dollar : "+rs);
        }
        else if(ch==10 && ans==11)
        {
            double rs;
            System.out.println("\nEnter Amount in South African Rand : ");
            rs=sc.nextDouble();
            rs=rs*0.050;
            System.out.println("\nSwiss Franc : "+rs);
        }
        else if(ch==10 && ans==12)
        {
            double rs;
            System.out.println("\nEnter Amount in South African Rand : ");
            rs=sc.nextDouble();
            rs=rs*0.20;
            System.out.println("\nU.A.E. Dirham : "+rs);
        }
        else if(ch==10 && ans==13)
        {
            double rs;
            System.out.println("\nEnter Amount in South African Rand : ");
            rs=sc.nextDouble();
            rs=rs*0.056;
            System.out.println("\nU.S. Dollar : "+rs);
        }
        else if(ch==11 && ans==1)
        {
            double rs;
            System.out.println("\nEnter Amount in Swiss Franc : ");
            rs=sc.nextDouble();
            rs=rs*1.68;
            System.out.println("\nAustralian Dollar : "+rs);
        }
        else if(ch==11 && ans==2)
        {
            double rs;
            System.out.println("\nEnter Amount in Swiss Franc : ");
            rs=sc.nextDouble();
            rs=rs*0.88;
            System.out.println("\nBritish Pound : "+rs);
        }
        else if(ch==11 && ans==3)
        {
            double rs;
            System.out.println("\nEnter Amount in Swiss Franc : ");
            rs=sc.nextDouble();
            rs=rs*1.53;
            System.out.println("\nCanadian Dollar : "+rs);
        }
        else if(ch==11 && ans==4)
        {
            double rs;
            System.out.println("\nEnter Amount in Swiss Franc : ");
            rs=sc.nextDouble();
            rs=rs*1.05;
            System.out.println("\nEuro : "+rs);
        }
        else if(ch==11 && ans==5)
        {
            double rs;
            System.out.println("\nEnter Amount in Swiss Franc : ");
            rs=sc.nextDouble();
            rs=rs*8.74;
            System.out.println("\nHong-Kong Dollar : "+rs);
        }
        else if(ch==11 && ans==6)
        {
            double rs;
            System.out.println("\nEnter Amount in Swiss Franc : ");
            rs=sc.nextDouble();
            rs=rs*93.52;
            System.out.println("\nIndian Rupee : "+rs);
        }
        else if(ch==11 && ans==7)
        {
            double rs;
            System.out.println("\nEnter Amount in Swiss Franc : ");
            rs=sc.nextDouble();
            rs=rs*178.74;
            System.out.println("\nJapanese Yen : "+rs);
        }
        else if(ch==11 && ans==8)
        {
            double rs;
            System.out.println("\nEnter Amount in Swiss Franc : ");
            rs=sc.nextDouble();
            rs=rs*0.34;
            System.out.println("\nKuwaiti Dinar : "+rs);
        }
        else if(ch==11 && ans==9)
        {
            double rs;
            System.out.println("\nEnter Amount in Swiss Franc : ");
            rs=sc.nextDouble();
            rs=rs*1.52;
            System.out.println("\nSingapore Dollar : "+rs);
        }
        else if(ch==11 && ans==10)
        {
            double rs;
            System.out.println("\nEnter Amount in Swiss Franc : ");
            rs=sc.nextDouble();
            rs=rs*20.10;
            System.out.println("\nSouth African Rand : "+rs);
        }
        else if(ch==11 && ans==12)
        {
            double rs;
            System.out.println("\nEnter Amount in Swiss Franc : ");
            rs=sc.nextDouble();
            rs=rs*4.11;
            System.out.println("\nU.A.E. Dirham : "+rs);
        }
        else if(ch==11 && ans==13)
        {
            double rs;
            System.out.println("\nEnter Amount in Swiss Franc : ");
            rs=sc.nextDouble();
            rs=rs*1.12;
            System.out.println("\nU.S. Dollar : "+rs);
        }
        else if(ch==12 && ans==1)
        {
            double rs;
            System.out.println("\nEnter Amount in U.A.E Dirham : ");
            rs=sc.nextDouble();
            rs=rs*0.41;
            System.out.println("\nAustralian Dollar : "+rs);
        }
        else if(ch==12 && ans==2)
        {
            double rs;
            System.out.println("\nEnter Amount in U.A.E Dirham : ");
            rs=sc.nextDouble();
            rs=rs*0.22;
            System.out.println("\nBritish Pound : "+rs);
        }
        else if(ch==12 && ans==3)
        {
            double rs;
            System.out.println("\nEnter Amount in U.A.E Dirham : ");
            rs=sc.nextDouble();
            rs=rs*0.37;
            System.out.println("\nCanadian Dollar : "+rs);
        }
        else if(ch==12 && ans==4)
        {
            double rs;
            System.out.println("\nEnter Amount in U.A.E Dirham : ");
            rs=sc.nextDouble();
            rs=rs*0.26;
            System.out.println("\nEuro : "+rs);
        }
        else if(ch==12 && ans==5)
        {
            double rs;
            System.out.println("\nEnter Amount in U.A.E Dirham : ");
            rs=sc.nextDouble();
            rs=rs*2.12;
            System.out.println("\nHong-Kong Dollar : "+rs);
        }
        else if(ch==12 && ans==6)
        {
            double rs;
            System.out.println("\nEnter Amount in U.A.E Dirham : ");
            rs=sc.nextDouble();
            rs=rs*22.75;
            System.out.println("\nIndian Rupee : "+rs);
        }
        else if(ch==12 && ans==7)
        {
            double rs;
            System.out.println("\nEnter Amount in U.A.E Dirham : ");
            rs=sc.nextDouble();
            rs=rs*43.60;
            System.out.println("\nJapanese Yen : "+rs);
        }
        else if(ch==12 && ans==8)
        {
            double rs;
            System.out.println("\nEnter Amount in U.A.E Dirham : ");
            rs=sc.nextDouble();
            rs=rs*0.084;
            System.out.println("\nKuwaiti Dinar : "+rs);
        }
        else if(ch==12 && ans==9)
        {
            double rs;
            System.out.println("\nEnter Amount in U.A.E Dirham : ");
            rs=sc.nextDouble();
            rs=rs*0.37;
            System.out.println("\nSingapore Dollar : "+rs);
        }
        else if(ch==12 && ans==10)
        {
            double rs;
            System.out.println("\nEnter Amount in U.A.E Dirham : ");
            rs=sc.nextDouble();
            rs=rs*4.89;
            System.out.println("\nSouth African Rand : "+rs);
        }
        else if(ch==12 && ans==11)
        {
            double rs;
            System.out.println("\nEnter Amount in U.A.E Dirham : ");
            rs=sc.nextDouble();
            rs=rs*0.24;
            System.out.println("\nSwiss Franc : "+rs);
        }
        else if(ch==12 && ans==13)
        {
            double rs;
            System.out.println("\nEnter Amount in U.A.E Dirham : ");
            rs=sc.nextDouble();
            rs=rs*0.27;
            System.out.println("\nU.S. Dollar : "+rs);
        }
        else if(ch==13 && ans==1)
        {
            double rs;
            System.out.println("\nEnter Amount in U.S. Dollar : ");
            rs=sc.nextDouble();
            rs=rs*1.50;
            System.out.println("\nAustralian Dollar : "+rs);
        }
        else if(ch==13 && ans==2)
        {
            double rs;
            System.out.println("\nEnter Amount in U.S. Dollar : ");
            rs=sc.nextDouble();
            rs=rs*0.79;
            System.out.println("\nBritish Pound : "+rs);
        }
        else if(ch==13 && ans==3)
        {
            double rs;
            System.out.println("\nEnter Amount in U.S. Dollar : ");
            rs=sc.nextDouble();
            rs=rs*1.37;
            System.out.println("\nCanadian Dollar : "+rs);
        }
        else if(ch==13 && ans==4)
        {
            double rs;
            System.out.println("\nEnter Amount in U.S. Dollar : ");
            rs=sc.nextDouble();
            rs=rs*0.93;
            System.out.println("\nEuro : "+rs);
        }
        else if(ch==13 && ans==5)
        {
            double rs;
            System.out.println("\nEnter Amount in U.S. Dollar : ");
            rs=sc.nextDouble();
            rs=rs*7.81;
            System.out.println("\nHong-Kong Dollar : "+rs);
        }
        else if(ch==13 && ans==6)
        {
            double rs;
            System.out.println("\nEnter Amount in U.S. Dollar : ");
            rs=sc.nextDouble();
            rs=rs*83.56;
            System.out.println("\nIndian Rupee : "+rs);
        }
        else if(ch==13 && ans==7)
        {
            double rs;
            System.out.println("\nEnter Amount in U.S. Dollar : ");
            rs=sc.nextDouble();
            rs=rs*159.78;
            System.out.println("\nJapanese Yen : "+rs);
        }
        else if(ch==13 && ans==8)
        {
            double rs;
            System.out.println("\nEnter Amount in U.S. Dollar : ");
            rs=sc.nextDouble();
            rs=rs*0.31;
            System.out.println("\nKuwaiti Dinar : "+rs);
        }
        else if(ch==13 && ans==9)
        {
            double rs;
            System.out.println("\nEnter Amount in U.S. Dollar : ");
            rs=sc.nextDouble();
            rs=rs*1.36;
            System.out.println("\nSingapore Dollar : "+rs);
        }
        else if(ch==13 && ans==10)
        {
            double rs;
            System.out.println("\nEnter Amount in U.S. Dollar : ");
            rs=sc.nextDouble();
            rs=rs*17.96;
            System.out.println("\nSouth African Rand : "+rs);
        }
        else if(ch==13 && ans==11)
        {
            double rs;
            System.out.println("\nEnter Amount in U.S. Dollar : ");
            rs=sc.nextDouble();
            rs=rs*0.89;
            System.out.println("\nSwiss Franc : "+rs);
        }
        else if(ch==13 && ans==12)
        {
            double rs;
            System.out.println("\nEnter Amount in U.S. Dollar : ");
            rs=sc.nextDouble();
            rs=rs*3.67;
            System.out.println("\nU.A.E. Dirham : "+rs);
        }
    }
}