package chater01.구구단;

public class MultiplicationColorTable {
    // 컬러 이상하면 false로 바꾸기
    private static final boolean USE_COLOR = true;

    // ANSI 컬러 코드 모음 (빨, 초, 노, 파, 보, 하늘, 회)
    private static final String[] COLORS = {
            "\u001B[31m", // 빨강
            "\u001B[32m", // 초록
            "\u001B[33m", // 노랑
            "\u001B[34m", // 파랑
            "\u001B[35m", // 보라
            "\u001B[36m", // 하늘
            "\u001B[90m", // 회색
            "\u001B[95m"  // 연보라(여분)
    };
    private static final String RESET = "\u001B[0m"; // 색상 초기화

    public static void main(String[] args) {
        // 헤더 출력: 2단~9단 제목을 컬럼으로 배치
        for (int dan = 2; dan <= 9; dan++) {
            // 색상 적용: 단(2~9)을 인덱스(0~7)에 매핑
            String color = colorOf(dan - 2);
            // %-12s : 12칸을 확보하고 왼쪽 정렬 (제목이 열기준으로 정렬되도록)
            System.out.printf("%s%-9s%s\t", color, dan + "단", RESET);
        }
        System.out.println(); // 헤더 줄바꿈
        printLine(8, 10);     // 구분선

        // 본문: j를 행(Row)으로 두고 2~9단을 열(Column)로 출력
        for (int j = 1; j <= 9; j++) {
            for (int dan = 2; dan <= 9; dan++) {
                String color = colorOf(dan - 2);

                // "%d x %d = %2d" : 결과를 2칸으로 맞춰서(1~9도 정렬)
                // \t : 컬럼 간격
                // color + ... + RESET : 한 셀(단 하나의 항목)마다 색상 적용 후 즉시 리셋
                System.out.printf("%s%d x %d = %2d%s\t",
                        color, dan, j, dan * j, RESET);
            }
            System.out.println(); // 행 끝나면 줄바꿈 (\n 과 동일)
        }
    }

    /** 색상 사용 여부에 따라 컬러를 돌려주거나, 색상 미사용 시 빈 문자열 반환 */
    private static String colorOf(int idx) {
        if (!USE_COLOR) return "";
        return COLORS[idx % COLORS.length];
    }

    /** 간단한 구분선 출력 (\n 없이 print, 끝에 println으로 줄바꿈) */
    private static void printLine(int columns, int widthPerCol) {
        for (int i = 0; i < columns; i++) {
            System.out.print("─".repeat(widthPerCol) + "\t");
        }
        System.out.println();
    }
}

