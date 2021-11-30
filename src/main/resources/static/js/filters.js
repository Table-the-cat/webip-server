

function grey(imgData) {
    for(var i = 0; i < imgData.data.length; i += 4) {
        var grey = (imgData.data[i] + imgData.data[i+1] + imgData.data[i+2]) / 3;
        imgData.data[i] = imgData.data[i+1] = imgData.data[i+2] = grey;
        imgData.data[i+3]=255;
    }

    return imgData;
}