package by.tms.homeworks.hw.hw_10032023;

public class Shop {
    private Product[] productList;

    public Shop() {
        productList = new Product[100];
    }

    public void addProduct(Product product) throws EntityAlreadyExistsException {
        int insertIdx = 0;
        for (int i = 0; i < productList.length; i++) {
            if (this.productList[i] == null) {
                insertIdx = i;
                break;
            }
        }
        for (int i = 0; i < insertIdx; i++) {
            if (product.getId() == productList[i].getId()) {
                throw new EntityAlreadyExistsException();
            }
        }
        productList[insertIdx] = product;
    }

    public Product[] printProductList() throws EmptyProductListException {
        if (this.productList[0] == null) {
            throw new EmptyProductListException();
        } else {
            return this.getProductList();
        }
    }

    private Product[] getProductList() {
        int nullIdx = 0;

        while (productList[nullIdx] != null) {
            nullIdx++;
        }

        Product[] products = new Product[nullIdx];
        for (int i = 0; i < nullIdx; i++) {
            products[i] = this.productList[i];
        }
        return products;
    }

    private int foundProductForIndex(int id) {
        int foundIndex = -1;
        for (int i = 0; i < this.productList.length; i++) {
            if (this.productList[i] == null) {
                break;
            }
            if (id == this.productList[i].getId()) {
                foundIndex = i;
            }
        }
        return foundIndex;
    }

    public void deleteProduct(int id) throws EmptyNotFoundException {
        int deletedProductIdx = this.foundProductForIndex(id);
        if (deletedProductIdx == -1) {
            throw new EmptyNotFoundException(id);
        } else {
            this.productList[deletedProductIdx] = null;
            while (this.productList[deletedProductIdx + 1] != null) {
                Product temp = this.productList[deletedProductIdx + 1];
                this.productList[deletedProductIdx + 1] = this.productList[deletedProductIdx];
                this.productList[deletedProductIdx] = temp;
            }
        }
    }

    public void changeProduct(int id, String name, int price) throws EmptyNotFoundException, EmptyProductListException {
        if (this.productList[0] == null) {
            throw new EmptyProductListException();
        } else {
            int changeIndex = this.foundProductForIndex(id);
            if (changeIndex == -1) {
                throw new EmptyNotFoundException(id);
            } else {
                this.productList[changeIndex].setName(name);
                this.productList[changeIndex].setPrice(price);
            }
        }
    }
}
