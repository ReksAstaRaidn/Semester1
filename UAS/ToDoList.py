def add_task ():
    task = input("Masukkan tugas yang ingin ditambahkan: ")
    with open("todolist1.txt", 'a', encoding='utf-8') as file:
        file.write(task + '\n')
    print("Tugas berhasil ditambahkan!")
    
def view_tasks ():
    print("Daftar Tugas:")
    try:
        with open("todolist1.txt", 'r', encoding='utf-8') as file:
            tasks = file.readlines()
            
        if tasks:
               print("Daftar Tugas:")
               
               for i, task in enumerate(tasks, 1):
                   print(f"{i}. {task.strip()}")
               print("="*40 + "\n")
        else:
            print("Tidak ada tugas dalam daftar.")
            
    except FileNotFoundError:
        print("Tidak ada tugas dalam daftar.")
        
def show_menu ():
    print("Menu To-Do List:")
    print("1. Tambah Tugas")    
    print("2. Lihat Aemua Tugas")
    print("3. Keluar")
    
        
def main ():
    while True:
        print("Menu To-Do List:")
        print("1. Tambah Tugas")
        print("2. Lihat Tugas")
        print("3. Keluar")
        
        pilihan = input("Pilih opsi (1/2/3): ")
        
        if pilihan == '1':
            add_task()
        elif pilihan == '2':
            view_tasks()
        elif pilihan == '3':
            print("Terima kasih telah menggunakan To-Do List!")
            print("Sampai jumpa lagi!")
            break
        else:
            print("Opsi tidak valid. Silakan coba lagi.")
            
if __name__ == "__main__":
    main()