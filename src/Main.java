function main() {
    var n, i, rating, sum, min, max, countHight;
    var rata;
    var daftarRating;

    n = Number(window.prompt('Enter a value for n'));
    sum = 0;
    countHight = 0;
    min = 1;
    max = -1;
    daftarRating = "daftar rating";
    for (i = 1; i <= n; i++) {
        rating = Number(window.prompt('Enter a value for rating'));
        daftarRating = daftarRating + " " + rating;
        sum = sum + rating;
        if (rating > max) {
            max = rating;
        }
        if (rating < min) {
            min = rating;
        }
        if (rating >= 4) {
            countHight = countHight + 1;
        }
    }
    rata = (double) sum / n;
    window.alert(daftarRating);
    window.alert("Rata rata: " + rata.toFixed(2));
    window.alert("Tertinggi: " + max);
    window.alert("Terendah: " + min);
    window.alert("Review rating >= 4: " + countHight + "orang");
    window.alert("Kondisi cukup,masih perlu peningkatan");
}
 function main() {
    var n, i, stokAwal, terjual, sisa;
    var nama, status;

    n = Number(window.prompt('Enter a value for n'));
    for (i = 1; i <= n; i++) {
        window.alert("Masukkan Nama Barang");
        nama = window.prompt('Enter a value for nama');
        stokAwal = Number(window.prompt('Enter a value for stokAwal'));
        terjual = Number(window.prompt('Enter a value for terjual'));
        sisa = stokAwal - terjual;
        if (sisa > 5) {
            status = "Stok aman";
        } else {
            if (sisa >= 1) {
                status = "Stok menipis";
            } else {
                status = "Habis, segera restock!";
            }
        }
        window.alert(nama);
        window.alert(stokAwal);
        window.alert(terjual);
        window.alert(sisa);
        window.alert(status);
        window.alert("Terimakasih telah menggunakan Program ini");
    }
}
function main() {
    var n, i, m, grandTotal;
    var statusAkhir;

    grandTotal = 0;
    window.alert("Silahkan Anda Masukkan Jumlah Penghuni");
    n = Number(window.prompt('Enter a value for n'));
    var namaArr = createArray(n);
    var subTotalArr = createArray(n);

    for (i = 0; i <= n - 1; i++) {
        namaArr[i] = window.prompt('Enter a value for namaArr[i]');
        m = Number(window.prompt('Enter a value for m'));
        subTotalArr[i] = hitungSubTotal(m);
        grandTotal = grandTotal + subTotalArr[i];
    }
    window.alert("Total konsumsi:");
    for (i = 0; i <= n - 1; i++) {
        window.alert(namaArr[i] + " = " + subTotalArr[i] + " wh");
    }
    window.alert("");
    window.alert("Total konsumsi kamar = " + grandTotal + " wh");
    statusAkhir = cekStatus(grandTotal);
    window.alert(statusAkhir);
}

function cekStatus(totalWh) {
    var pesan;

    if (totalWh <= 1000) {
        pesan = "Konsumsi masih dalam batas wajar.";
    } else {
        pesan = "Konsumsi berlebihan, harap hemat energi.";
    }
    
    return pesan;
}

function hitungSubTotal(jumlahBarang) {
    var j, watt, total;

    total = 0;
    for (j = 1; j <= jumlahBarang; j++) {
        watt = Number(window.prompt('Enter a value for watt'));
        total = total + watt;
    }
    
    return total;
}
function main() {
    var n, i, totalShift, maxShift, minShift;
    var rataRata;
    var maxNama, minNama, kesimpulan;

    totalShift = 0;
    maxShift = -1;
    minShift = 1000;
    window.alert("Sistem Penjadawalan Shift Asisten Lab");
    window.alert("Silahkan Masukkan Jumlah Asisten: ");
    n = Number(window.prompt('Enter a value for n'));
    var namaArr = createArray(n);
    var shiftArr = createArray(n);

    for (i = 0; i <= n - 1; i++) {
        namaArr[i] = window.prompt('Enter a value for namaArr[i]');
        shiftArr[i] = Number(window.prompt('Enter a value for shiftArr[i]'));
    }
    for (i = 0; i <= n - 1; i++) {
        totalShift = totalShift + shiftArr[i];
        if (shiftArr[i] > maxShift) {
            maxShift = shiftArr[i];
            maxNama = namaArr[i];
        }
        if (shiftArr[i] < minShift) {
            minShift = shiftArr[i];
            minNama = namaArr[i];
        }
    }
    rataRata = (double) totalShift / n;
    window.alert("Daftar Shift:");
    for (i = 0; i <= n - 1; i++) {
        window.alert(namaArr[i] + " = " + shiftArr[i]);
    }
    window.alert("");
    window.alert("Total shift = " + totalShift);
    window.alert("Rata-rata = " + rataRata);
    window.alert("Shift terbanyak: " + maxNama + " (" + maxShift + ")");
    window.alert("Shift tersedikit: " + minNama + " (" + minShift + ")");
    window.alert("");
    kesimpulan = cekKesimpulan(maxShift, minShift);
    window.alert(kesimpulan);
}

function cekKesimpulan(maxVal, minVal) {
    var pesan;
    var selisih;

    selisih = maxVal - minVal;
    if (selisih >= 3) {
        pesan = "Distribusi shift tidak merata, beberapa asisten terbebani.";
    } else {
        pesan = "Distribusi shift cukup merata.";
    }
    
    return pesan;
}

