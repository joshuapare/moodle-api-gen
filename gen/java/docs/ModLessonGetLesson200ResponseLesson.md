

# ModLessonGetLesson200ResponseLesson


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**activitylink** | **Integer** | Id of the next activity to be linked once the lesson is completed |  [optional] |
|**allowofflineattempts** | **Boolean** | Whether to allow the lesson to be attempted offline in the mobile app |  |
|**available** | **Integer** | Available from |  [optional] |
|**bgcolor** | **String** | Slideshow bgcolor |  [optional] |
|**completionendreached** | **Integer** | Require end reached for completion? |  [optional] |
|**completiontimespent** | **Integer** | Student must do this activity at least for |  [optional] |
|**conditions** | **String** | Conditions to enable the lesson |  [optional] |
|**course** | **Integer** | Foreign key reference to the course this lesson is part of. |  |
|**coursemodule** | **Integer** | Course module id. |  |
|**custom** | **Boolean** | Custom scoring? |  [optional] |
|**deadline** | **Integer** | Available until |  [optional] |
|**dependency** | **Integer** | Dependent on (another lesson id) |  [optional] |
|**displayleft** | **Boolean** | Display left pages menu? |  [optional] |
|**displayleftif** | **Integer** | Minimum grade to display menu |  [optional] |
|**feedback** | **Boolean** | Display default feedback |  [optional] |
|**grade** | **Integer** | The total that the grade is scaled to be out of |  [optional] |
|**height** | **Integer** | Slideshow height |  [optional] |
|**id** | **Integer** | Standard Moodle primary key. |  |
|**intro** | **String** | Lesson introduction text. |  [optional] |
|**introfiles** | [**List&lt;CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner&gt;**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  |  [optional] |
|**introformat** | **Integer** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) |  [optional] |
|**lang** | **String** | Forced activity language |  |
|**maxanswers** | **Integer** | Maximum answers per page |  [optional] |
|**maxattempts** | **Integer** | Maximum attempts |  [optional] |
|**maxpages** | **Integer** | Number of pages to show |  [optional] |
|**mediaclose** | **Integer** | Display a close button in the popup? |  [optional] |
|**mediafile** | **String** | Local file path or full external URL |  [optional] |
|**mediafiles** | [**List&lt;CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner&gt;**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  |  [optional] |
|**mediaheight** | **Integer** | Popup for media file height |  [optional] |
|**mediawidth** | **Integer** | Popup for media with |  [optional] |
|**minquestions** | **Integer** | Minimum number of questions |  [optional] |
|**modattempts** | **Boolean** | Allow student review? |  [optional] |
|**name** | **String** | Lesson name. |  |
|**nextpagedefault** | **Integer** | Action for a correct answer |  [optional] |
|**ongoing** | **Boolean** | Display ongoing score? |  [optional] |
|**password** | **String** | Password |  [optional] |
|**practice** | **Boolean** | Practice lesson? |  [optional] |
|**progressbar** | **Boolean** | Display progress bar? |  [optional] |
|**retake** | **Boolean** | Re-takes allowed |  [optional] |
|**review** | **Boolean** | Provide option to try a question again |  [optional] |
|**slideshow** | **Boolean** | Display lesson as slideshow |  [optional] |
|**timelimit** | **Integer** | Time limit |  [optional] |
|**timemodified** | **Integer** | Last time settings were updated |  [optional] |
|**usemaxgrade** | **Integer** | How to calculate the final grade |  [optional] |
|**usepassword** | **Boolean** | Password protected lesson? |  [optional] |
|**width** | **Integer** | Slideshow width |  [optional] |



