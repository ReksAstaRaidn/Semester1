def hitung (angka1, angka2, operasi = "tambah"):
    if operasi == "tambah":
        return angka1 + angka2
    elif operasi == "kurang":
        return angka1 - angka2
    elif operasi == "kali":
        return angka1 * angka2
    elif operasi == "bagi":
        if angka2 == 0:
            return "tidak bisa dibagi dengan nol"
        return angka1 / angka2
    else:
        return "Operasi tidak dikenali"
    
print(hitung(10, 5, "tambah"))  
print(hitung(10, 5, "kali"))
print(hitung(10, 5, "bagi"))
print(hitung(10, 5, "kurang"))
print(hitung(10, 5, ))
    