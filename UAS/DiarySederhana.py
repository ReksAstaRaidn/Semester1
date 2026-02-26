print('Selamat Datang di Program Diary Sederhana!')

print()

namaFile = input('Masukkan nama file: ')
isiFile = input('Masukkan isi catatan: ')

print()

with open(f"{namaFile}.txt", 'w', encoding='utf-8') as file:
    file.write(isiFile)
    
print(f'File Berhasil disimpan!')