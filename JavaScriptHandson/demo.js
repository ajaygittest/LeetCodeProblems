function getUsers() {
    return new Promise((resolve, reject) => {
        let users = [];
        setTimeout(() => {
            users = [
                { username: 'john', email: 'john@gmail.com' }];
            resolve(users);
        }, 1000);
        return users;
    })
}

function findUser(usersname) {
    getUsers().then((users) => {
        const user = users.find((users) => users.username === usersname);
    })
}
console.log(findUser('john'))