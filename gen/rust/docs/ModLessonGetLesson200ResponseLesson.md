# ModLessonGetLesson200ResponseLesson

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activitylink** | Option<**i32**> | Id of the next activity to be linked once the lesson is completed | [optional][default to null]
**allowofflineattempts** | **bool** | Whether to allow the lesson to be attempted offline in the mobile app | [default to null]
**available** | Option<**i32**> | Available from | [optional][default to null]
**bgcolor** | Option<**String**> | Slideshow bgcolor | [optional][default to null]
**completionendreached** | Option<**i32**> | Require end reached for completion? | [optional][default to null]
**completiontimespent** | Option<**i32**> | Student must do this activity at least for | [optional][default to null]
**conditions** | Option<**String**> | Conditions to enable the lesson | [optional][default to null]
**course** | **i32** | Foreign key reference to the course this lesson is part of. | [default to null]
**coursemodule** | **i32** | Course module id. | [default to null]
**custom** | Option<**bool**> | Custom scoring? | [optional][default to null]
**deadline** | Option<**i32**> | Available until | [optional][default to null]
**dependency** | Option<**i32**> | Dependent on (another lesson id) | [optional][default to null]
**displayleft** | Option<**bool**> | Display left pages menu? | [optional][default to null]
**displayleftif** | Option<**i32**> | Minimum grade to display menu | [optional][default to null]
**feedback** | Option<**bool**> | Display default feedback | [optional][default to null]
**grade** | Option<**i32**> | The total that the grade is scaled to be out of | [optional][default to null]
**height** | Option<**i32**> | Slideshow height | [optional][default to null]
**id** | **i32** | Standard Moodle primary key. | [default to null]
**intro** | Option<**String**> | Lesson introduction text. | [optional][default to null]
**introfiles** | Option<[**Vec<models::CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner>**](core_blog_get_entries_200_response_entries_inner_summaryfiles_inner.md)> |  | [optional]
**introformat** | Option<**i32**> | intro format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | [optional][default to 0]
**lang** | **String** | Forced activity language | 
**maxanswers** | Option<**i32**> | Maximum answers per page | [optional][default to null]
**maxattempts** | Option<**i32**> | Maximum attempts | [optional][default to null]
**maxpages** | Option<**i32**> | Number of pages to show | [optional][default to null]
**mediaclose** | Option<**i32**> | Display a close button in the popup? | [optional][default to null]
**mediafile** | Option<**String**> | Local file path or full external URL | [optional][default to null]
**mediafiles** | Option<[**Vec<models::CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner>**](core_blog_get_entries_200_response_entries_inner_summaryfiles_inner.md)> |  | [optional]
**mediaheight** | Option<**i32**> | Popup for media file height | [optional][default to null]
**mediawidth** | Option<**i32**> | Popup for media with | [optional][default to null]
**minquestions** | Option<**i32**> | Minimum number of questions | [optional][default to null]
**modattempts** | Option<**bool**> | Allow student review? | [optional][default to null]
**name** | **String** | Lesson name. | [default to null]
**nextpagedefault** | Option<**i32**> | Action for a correct answer | [optional][default to null]
**ongoing** | Option<**bool**> | Display ongoing score? | [optional][default to null]
**password** | Option<**String**> | Password | [optional][default to null]
**practice** | Option<**bool**> | Practice lesson? | [optional][default to null]
**progressbar** | Option<**bool**> | Display progress bar? | [optional][default to null]
**retake** | Option<**bool**> | Re-takes allowed | [optional][default to null]
**review** | Option<**bool**> | Provide option to try a question again | [optional][default to null]
**slideshow** | Option<**bool**> | Display lesson as slideshow | [optional][default to null]
**timelimit** | Option<**i32**> | Time limit | [optional][default to null]
**timemodified** | Option<**i32**> | Last time settings were updated | [optional][default to null]
**usemaxgrade** | Option<**i32**> | How to calculate the final grade | [optional][default to null]
**usepassword** | Option<**bool**> | Password protected lesson? | [optional][default to null]
**width** | Option<**i32**> | Slideshow width | [optional][default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


