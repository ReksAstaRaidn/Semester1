angkaRahasia = 7 

while True:
    tebakan = int(input("Tebak angka (1-10):"))
        
    if(tebakan == angkaRahasia):
        print("Benar! Angka yang tepat adalah " + str(angkaRahasia))
        break
    
    if(tebakan != angkaRahasia):
        print("Salah! Coba lagi.")

    
  