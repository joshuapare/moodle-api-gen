# ModScormGetScormsByCourses200ResponseScormsInner

SCORM

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auto** | **bool** | Auto continue? | [optional] [default to False]
**autocommit** | **bool** | Save track data automatically? | [optional] [default to False]
**completionscorerequired** | **int** | Minimum score required | [optional] [default to null]
**completionstatusallscos** | **int** | Require all scos to return completion status | [optional] [default to null]
**completionstatusrequired** | **int** | Status passed/completed required? | [optional] [default to null]
**course** | **int** | Course id | [optional] 
**coursemodule** | **int** | Course module id | [optional] 
**displayattemptstatus** | **int** | How to display attempt status | [optional] [default to null]
**displaycoursestructure** | **bool** | Display contents structure | [optional] [default to False]
**forcecompleted** | **bool** | Status current attempt is forced to \&quot;completed\&quot; | [optional] [default to False]
**forcenewattempt** | **int** | Controls re-entry behaviour | [optional] [default to null]
**grademethod** | **int** | Grade method | [optional] [default to null]
**groupingid** | **int** | Group id | [optional] 
**groupmode** | **int** | Group mode | [optional] 
**height** | **int** | Frame height | [optional] [default to null]
**hidebrowse** | **bool** | Disable preview mode? | [optional] [default to False]
**hidetoc** | **int** | How to display the SCORM structure in player | [optional] [default to null]
**id** | **int** | Activity instance id | [optional] 
**intro** | **str** | Activity introduction | [optional] 
**introfiles** | [**List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**introformat** | **int** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**lang** | **str** | Forced activity language | [optional] 
**lastattemptlock** | **bool** | Prevents to launch new attempts once finished | [optional] [default to False]
**launch** | **int** | First content to launch | [optional] [default to null]
**maxattempt** | **int** | Maximum number of attemtps | [optional] [default to null]
**maxgrade** | **int** | Max grade | [optional] [default to null]
**md5hash** | **str** | MD5 Hash of package file | [optional] [default to 'null']
**name** | **str** | Activity name | [optional] 
**nav** | **int** | Show navigation buttons | [optional] [default to null]
**navpositionleft** | **int** | Navigation position left | [optional] [default to null]
**navpositiontop** | **int** | Navigation position top | [optional] [default to null]
**options** | **str** | Additional options | [optional] 
**packagesize** | **int** | SCORM zip package size | [optional] [default to null]
**packageurl** | **str** | SCORM zip package URL | [optional] [default to 'null']
**popup** | **int** | Display in current or new window | [optional] [default to null]
**protectpackagedownloads** | **bool** | Protect package downloads? | [optional] [default to False]
**reference** | **str** | Reference to the package | [optional] [default to 'null']
**revision** | **int** | Revison number | [optional] [default to null]
**scormtype** | **str** | SCORM type | [optional] [default to 'null']
**section** | **int** | Course section id | [optional] 
**sha1hash** | **str** | Package content or ext path hash | [optional] [default to 'null']
**skipview** | **int** | How to skip the content structure page | [optional] [default to null]
**timeclose** | **int** | Available to | [optional] [default to null]
**timemodified** | **int** | Time of last modification | [optional] 
**timeopen** | **int** | Available from | [optional] [default to null]
**updatefreq** | **int** | Auto-update frequency for remote packages | [optional] [default to null]
**version** | **str** | SCORM version (SCORM_12, SCORM_13, SCORM_AICC) | [optional] [default to 'null']
**visible** | **bool** | Visible | [optional] 
**whatgrade** | **int** | What grade | [optional] [default to null]
**width** | **int** | Frame width | [optional] [default to null]

## Example

```python
from openapi_client.models.mod_scorm_get_scorms_by_courses200_response_scorms_inner import ModScormGetScormsByCourses200ResponseScormsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModScormGetScormsByCourses200ResponseScormsInner from a JSON string
mod_scorm_get_scorms_by_courses200_response_scorms_inner_instance = ModScormGetScormsByCourses200ResponseScormsInner.from_json(json)
# print the JSON string representation of the object
print(ModScormGetScormsByCourses200ResponseScormsInner.to_json())

# convert the object into a dict
mod_scorm_get_scorms_by_courses200_response_scorms_inner_dict = mod_scorm_get_scorms_by_courses200_response_scorms_inner_instance.to_dict()
# create an instance of ModScormGetScormsByCourses200ResponseScormsInner from a dict
mod_scorm_get_scorms_by_courses200_response_scorms_inner_from_dict = ModScormGetScormsByCourses200ResponseScormsInner.from_dict(mod_scorm_get_scorms_by_courses200_response_scorms_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


