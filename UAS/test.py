dompetReksa = int(input("Masukkan jumlah uang Reksa: \n"))
hargaApel = 3000

if dompetReksa >= hargaApel:
    dompetReksa -= hargaApel
    print("Reksa membeli apel.")
    print("Sisa uang Reksa:", dompetReksa)