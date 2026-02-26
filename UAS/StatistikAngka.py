def statistik_angka (*args):
    if len(args) == 0:
        return None

    total = sum(args)
    jumlah_data = len(args)
    rata_rata = total / jumlah_data
    
    hasil = {
        'total': total,
        'rata_rata': rata_rata,
        'jumlah_data': jumlah_data
    }
    
    return hasil

hasil = statistik_angka(10, 20, 30, 40)
print(hasil)

