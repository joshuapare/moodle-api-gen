# ModScormGetScormsByCourses200ResponseScormsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auto** | Option<**bool**> | Auto continue? | [optional][default to null]
**autocommit** | Option<**bool**> | Save track data automatically? | [optional][default to null]
**completionscorerequired** | Option<**i32**> | Minimum score required | [optional][default to null]
**completionstatusallscos** | Option<**i32**> | Require all scos to return completion status | [optional][default to null]
**completionstatusrequired** | Option<**i32**> | Status passed/completed required? | [optional][default to null]
**course** | Option<**i32**> | Course id | [optional]
**coursemodule** | Option<**i32**> | Course module id | [optional]
**displayattemptstatus** | Option<**i32**> | How to display attempt status | [optional][default to null]
**displaycoursestructure** | Option<**bool**> | Display contents structure | [optional][default to null]
**forcecompleted** | Option<**bool**> | Status current attempt is forced to \"completed\" | [optional][default to null]
**forcenewattempt** | Option<**i32**> | Controls re-entry behaviour | [optional][default to null]
**grademethod** | Option<**i32**> | Grade method | [optional][default to null]
**groupingid** | Option<**i32**> | Group id | [optional]
**groupmode** | Option<**i32**> | Group mode | [optional]
**height** | Option<**i32**> | Frame height | [optional][default to null]
**hidebrowse** | Option<**bool**> | Disable preview mode? | [optional][default to null]
**hidetoc** | Option<**i32**> | How to display the SCORM structure in player | [optional][default to null]
**id** | Option<**i32**> | Activity instance id | [optional]
**intro** | Option<**String**> | Activity introduction | [optional]
**introfiles** | Option<[**Vec<models::CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>**](core_block_get_dashboard_blocks_200_response_blocks_inner_contents_files_inner.md)> |  | [optional]
**introformat** | Option<**i32**> | intro format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | [optional]
**lang** | Option<**String**> | Forced activity language | [optional]
**lastattemptlock** | Option<**bool**> | Prevents to launch new attempts once finished | [optional][default to null]
**launch** | Option<**i32**> | First content to launch | [optional][default to null]
**maxattempt** | Option<**i32**> | Maximum number of attemtps | [optional][default to null]
**maxgrade** | Option<**i32**> | Max grade | [optional][default to null]
**md5hash** | Option<**String**> | MD5 Hash of package file | [optional][default to null]
**name** | Option<**String**> | Activity name | [optional]
**nav** | Option<**i32**> | Show navigation buttons | [optional][default to null]
**navpositionleft** | Option<**i32**> | Navigation position left | [optional][default to null]
**navpositiontop** | Option<**i32**> | Navigation position top | [optional][default to null]
**options** | Option<**String**> | Additional options | [optional]
**packagesize** | Option<**i32**> | SCORM zip package size | [optional][default to null]
**packageurl** | Option<**String**> | SCORM zip package URL | [optional][default to null]
**popup** | Option<**i32**> | Display in current or new window | [optional][default to null]
**protectpackagedownloads** | Option<**bool**> | Protect package downloads? | [optional][default to null]
**reference** | Option<**String**> | Reference to the package | [optional][default to null]
**revision** | Option<**i32**> | Revison number | [optional][default to null]
**scormtype** | Option<**String**> | SCORM type | [optional][default to null]
**section** | Option<**i32**> | Course section id | [optional]
**sha1hash** | Option<**String**> | Package content or ext path hash | [optional][default to null]
**skipview** | Option<**i32**> | How to skip the content structure page | [optional][default to null]
**timeclose** | Option<**i32**> | Available to | [optional][default to null]
**timemodified** | Option<**i32**> | Time of last modification | [optional]
**timeopen** | Option<**i32**> | Available from | [optional][default to null]
**updatefreq** | Option<**i32**> | Auto-update frequency for remote packages | [optional][default to null]
**version** | Option<**String**> | SCORM version (SCORM_12, SCORM_13, SCORM_AICC) | [optional][default to null]
**visible** | Option<**bool**> | Visible | [optional]
**whatgrade** | Option<**i32**> | What grade | [optional][default to null]
**width** | Option<**i32**> | Frame width | [optional][default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

