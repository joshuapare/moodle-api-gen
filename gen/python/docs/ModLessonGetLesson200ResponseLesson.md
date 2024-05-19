# ModLessonGetLesson200ResponseLesson


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activitylink** | **int** | Id of the next activity to be linked once the lesson is completed | [optional] [default to null]
**allowofflineattempts** | **bool** | Whether to allow the lesson to be attempted offline in the mobile app | [default to False]
**available** | **int** | Available from | [optional] [default to null]
**bgcolor** | **str** | Slideshow bgcolor | [optional] [default to 'null']
**completionendreached** | **int** | Require end reached for completion? | [optional] [default to null]
**completiontimespent** | **int** | Student must do this activity at least for | [optional] [default to null]
**conditions** | **str** | Conditions to enable the lesson | [optional] [default to 'null']
**course** | **int** | Foreign key reference to the course this lesson is part of. | [default to null]
**coursemodule** | **int** | Course module id. | [default to null]
**custom** | **bool** | Custom scoring? | [optional] [default to False]
**deadline** | **int** | Available until | [optional] [default to null]
**dependency** | **int** | Dependent on (another lesson id) | [optional] [default to null]
**displayleft** | **bool** | Display left pages menu? | [optional] [default to False]
**displayleftif** | **int** | Minimum grade to display menu | [optional] [default to null]
**feedback** | **bool** | Display default feedback | [optional] [default to False]
**grade** | **int** | The total that the grade is scaled to be out of | [optional] [default to null]
**height** | **int** | Slideshow height | [optional] [default to null]
**id** | **int** | Standard Moodle primary key. | [default to null]
**intro** | **str** | Lesson introduction text. | [optional] [default to 'null']
**introfiles** | [**List[CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner]**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**introformat** | **int** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**lang** | **str** | Forced activity language | 
**maxanswers** | **int** | Maximum answers per page | [optional] [default to null]
**maxattempts** | **int** | Maximum attempts | [optional] [default to null]
**maxpages** | **int** | Number of pages to show | [optional] [default to null]
**mediaclose** | **int** | Display a close button in the popup? | [optional] [default to null]
**mediafile** | **str** | Local file path or full external URL | [optional] [default to 'null']
**mediafiles** | [**List[CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner]**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**mediaheight** | **int** | Popup for media file height | [optional] [default to null]
**mediawidth** | **int** | Popup for media with | [optional] [default to null]
**minquestions** | **int** | Minimum number of questions | [optional] [default to null]
**modattempts** | **bool** | Allow student review? | [optional] [default to False]
**name** | **str** | Lesson name. | [default to 'null']
**nextpagedefault** | **int** | Action for a correct answer | [optional] [default to null]
**ongoing** | **bool** | Display ongoing score? | [optional] [default to False]
**password** | **str** | Password | [optional] [default to 'null']
**practice** | **bool** | Practice lesson? | [optional] [default to False]
**progressbar** | **bool** | Display progress bar? | [optional] [default to False]
**retake** | **bool** | Re-takes allowed | [optional] [default to False]
**review** | **bool** | Provide option to try a question again | [optional] [default to False]
**slideshow** | **bool** | Display lesson as slideshow | [optional] [default to False]
**timelimit** | **int** | Time limit | [optional] [default to null]
**timemodified** | **int** | Last time settings were updated | [optional] [default to null]
**usemaxgrade** | **int** | How to calculate the final grade | [optional] [default to null]
**usepassword** | **bool** | Password protected lesson? | [optional] [default to False]
**width** | **int** | Slideshow width | [optional] [default to null]

## Example

```python
from openapi_client.models.mod_lesson_get_lesson200_response_lesson import ModLessonGetLesson200ResponseLesson

# TODO update the JSON string below
json = "{}"
# create an instance of ModLessonGetLesson200ResponseLesson from a JSON string
mod_lesson_get_lesson200_response_lesson_instance = ModLessonGetLesson200ResponseLesson.from_json(json)
# print the JSON string representation of the object
print(ModLessonGetLesson200ResponseLesson.to_json())

# convert the object into a dict
mod_lesson_get_lesson200_response_lesson_dict = mod_lesson_get_lesson200_response_lesson_instance.to_dict()
# create an instance of ModLessonGetLesson200ResponseLesson from a dict
mod_lesson_get_lesson200_response_lesson_from_dict = ModLessonGetLesson200ResponseLesson.from_dict(mod_lesson_get_lesson200_response_lesson_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


