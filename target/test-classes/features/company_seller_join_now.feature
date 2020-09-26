@Company_seller_join
  Feature:
Scenario: TC_0003 kullanici gecerli verilerle Company Seller hesabi olusturur
Given kullanici "http://glbtrader.com/" sayfasindadir
And kullanici  Seller Join Now butonuna tiklar
And kullanici Company Seller sekmesine tiklar
And kullanici Company Name girer
And kullanici Company Mobile girer
And kullanici Company Address girer
And kullanici Name girer
And kullanici Email girer
And kullanici Sub Domain girer
And kullanici Mobile Number girer
And kullanici Country dropdowndan secer
And kullanici State girer
And kullanici City girer
And kullanici Address girer
And kullanici Postal Code girer
And kullanici Categories dropdowndan secer
And kullanici Password girer
And kullanici Registration butonuna tiklar
Then kullanici "Thank you to join our team. You are Registered Successfully." masajini gormelidir