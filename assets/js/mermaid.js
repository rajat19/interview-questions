const mermaidConfig = {
    startOnLoad: true,
    theme: 'dark',
    flowchart: {
        useMaxWidth: false,
        htmlLabels: true
    }
};

const initializeMermaid = (element) => {
    mermaid.initialize(mermaidConfig);
    mermaid.init(undefined, element);
};

const handleDynamicContentChange = () => {
    const postData = document.getElementById('post-data');
    const observer = new MutationObserver((mutationsList) => {
        mutationsList.forEach((mutation) => {
            if (mutation.type === 'childList') {
                const mermaidElements = postData.querySelectorAll('.language-mermaid');
                mermaidElements.forEach((element) => {
                    initializeMermaid(element);
                });
            }
        });
    });

    const configObserver = { childList: true, subtree: true };
    observer.observe(postData, configObserver);
};

handleDynamicContentChange();