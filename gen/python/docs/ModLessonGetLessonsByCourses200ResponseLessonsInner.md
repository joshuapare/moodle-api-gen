# ModLessonGetLessonsByCourses200ResponseLessonsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activitylink** | **int** | Id of the next activity to be linked once the lesson is completed | [optional] 
**allowofflineattempts** | **bool** | Whether to allow the lesson to be attempted offline in the mobile app | [optional] 
**available** | **int** | Available from | [optional] 
**bgcolor** | **str** | Slideshow bgcolor | [optional] 
**completionendreached** | **int** | Require end reached for completion? | [optional] 
**completiontimespent** | **int** | Student must do this activity at least for | [optional] 
**conditions** | **str** | Conditions to enable the lesson | [optional] 
**course** | **int** | Foreign key reference to the course this lesson is part of. | [optional] 
**coursemodule** | **int** | Course module id. | [optional] 
**custom** | **bool** | Custom scoring? | [optional] 
**deadline** | **int** | Available until | [optional] 
**dependency** | **int** | Dependent on (another lesson id) | [optional] 
**displayleft** | **bool** | Display left pages menu? | [optional] 
**displayleftif** | **int** | Minimum grade to display menu | [optional] 
**feedback** | **bool** | Display default feedback | [optional] 
**grade** | **int** | The total that the grade is scaled to be out of | [optional] 
**height** | **int** | Slideshow height | [optional] 
**id** | **int** | Standard Moodle primary key. | [optional] 
**intro** | **str** | Lesson introduction text. | [optional] 
**introfiles** | [**List[CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner]**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**introformat** | **int** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**lang** | **str** | Forced activity language | [optional] 
**maxanswers** | **int** | Maximum answers per page | [optional] 
**maxattempts** | **int** | Maximum attempts | [optional] 
**maxpages** | **int** | Number of pages to show | [optional] 
**mediaclose** | **int** | Display a close button in the popup? | [optional] 
**mediafile** | **str** | Local file path or full external URL | [optional] 
**mediafiles** | [**List[CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner]**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**mediaheight** | **int** | Popup for media file height | [optional] 
**mediawidth** | **int** | Popup for media with | [optional] 
**minquestions** | **int** | Minimum number of questions | [optional] 
**modattempts** | **bool** | Allow student review? | [optional] 
**name** | **str** | Lesson name. | [optional] 
**nextpagedefault** | **int** | Action for a correct answer | [optional] 
**ongoing** | **bool** | Display ongoing score? | [optional] 
**password** | **str** | Password | [optional] 
**practice** | **bool** | Practice lesson? | [optional] 
**progressbar** | **bool** | Display progress bar? | [optional] 
**retake** | **bool** | Re-takes allowed | [optional] 
**review** | **bool** | Provide option to try a question again | [optional] 
**slideshow** | **bool** | Display lesson as slideshow | [optional] 
**timelimit** | **int** | Time limit | [optional] 
**timemodified** | **int** | Last time settings were updated | [optional] 
**usemaxgrade** | **int** | How to calculate the final grade | [optional] 
**usepassword** | **bool** | Password protected lesson? | [optional] 
**width** | **int** | Slideshow width | [optional] 

## Example

```python
from openapi_client.models.mod_lesson_get_lessons_by_courses200_response_lessons_inner import ModLessonGetLessonsByCourses200ResponseLessonsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModLessonGetLessonsByCourses200ResponseLessonsInner from a JSON string
mod_lesson_get_lessons_by_courses200_response_lessons_inner_instance = ModLessonGetLessonsByCourses200ResponseLessonsInner.from_json(json)
# print the JSON string representation of the object
print(ModLessonGetLessonsByCourses200ResponseLessonsInner.to_json())

# convert the object into a dict
mod_lesson_get_lessons_by_courses200_response_lessons_inner_dict = mod_lesson_get_lessons_by_courses200_response_lessons_inner_instance.to_dict()
# create an instance of ModLessonGetLessonsByCourses200ResponseLessonsInner from a dict
mod_lesson_get_lessons_by_courses200_response_lessons_inner_from_dict = ModLessonGetLessonsByCourses200ResponseLessonsInner.from_dict(mod_lesson_get_lessons_by_courses200_response_lessons_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


