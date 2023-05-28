Втора лабораториска вежба по Софтверско инженерство

# SI_2023_lab2_162012

Бојан Петрушевски 162012



**Control Flow Graph**
![CFG](https://github.com/bojanpet55/SI_2023_lab2_162012/assets/82101948/1a5bbbb7-23ef-4048-a85b-f4601f5cc205)



**Цикломатска комплексност** на овој граф може да се пресмета на следниов начин:
М= Е-N + 2 * P =>  38 – 29 + 2*1 = 11
M- цикломатска комплексност 
E – број на “стрелки” помеѓу два јазли 
N – број на јазли (nodes)
P – број на јазли без нанадвор насочени стрелки ( крајни јазли ) 

**EveryBranch**
![EveryBranch](https://github.com/bojanpet55/SI_2023_lab2_162012/assets/82101948/42cf48f5-0e8d-4c29-8eb2-af7d94888008)
1. Exception password=null
2. password contains " " exe: T @#$#%
3. Ussername =null;email=correct; password.contains(Special Character);
4. ussername = password 

**Multiple condition**
if (user==null || user.getPassword()==null || user.getEmail()==null).
За да ги покриеме сите услови во овој израз , треба да направиме 4 различни услови:
1. user=null; user.getPassword()!=null ; user.getEmail()= валиден емаил - првиот е точен, другите не .
2. user=валидна вредност; user.getPassword()=null; user.getEmail() = валидна вредност - вториот е точен, другите не.
3. user = валидна вредност ; user.getPassword()!=null; user.getEmail() = null - третиот е точен, првиот и вториот се неточни. 
4. user!=null ; user.getPassword()!=null ; user.getEmail()!=null - сите услови се неточни.
