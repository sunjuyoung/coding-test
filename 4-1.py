from collections import deque


n,m = map(int , input().split())

graph = []

for i in range(n):
    graph.append(list(map(int,input())))


dx = []
dy = []



def bfs(x,y):
    queue = deque()
    