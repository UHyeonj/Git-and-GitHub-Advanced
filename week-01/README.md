
# 요구사항

문제 지문을 읽고 적절한 답변을 작성 한 후, 다음 요구사항에 맞게 커밋을 생성해주세요.

-   커밋 메시지는 아래의 내용으로 통일한다.

```
docs(w01): 연습 문제 풀이 <이름>
```

<details>
<summary>예시 보기</summary>

```
docs(w01): 연습 문제 풀이 <이혜연>
```

</details>

# 연습 문제


> Q. 처음 저장소를 Clone 하면 모든 파일은 Untracked이면서 Unmodified 상태이다. (N)

clone한다면 바로 git에서 관리하기 때문에 untracked이면서 unmodified이다.

> Q. Git은 순수한 델타 기반 버전 관리 시스템이다. (N)

어느정도 델타 기반이지만, 순수한 건 아니다. git은 스냅샷 기반에 더 가깝다.

> Q. 새로운 파일을 생성 한 후 `git add` 명령을 통해 Stage 하였다. `.git` directory(로컬 데이터베이스)에 스냅샷이 생성되는가? (`git commit`은 아직 하지 않은 것으로 가정.)  (Y)