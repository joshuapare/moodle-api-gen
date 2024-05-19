# MoodleClient.Model.ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Contenthash** | **string** | Sha1 hash of file content. | [optional] [default to "null"]
**Context** | **int** | context | [optional] [default to null]
**Course** | **int** | Course id this h5p activity is part of. | [optional] [default to null]
**Coursemodule** | **int** | coursemodule | [optional] 
**Deployedfile** | [**ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInnerDeployedfile**](ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInnerDeployedfile.md) |  | [optional] 
**Displayoptions** | **int** | H5P Button display options. | [optional] [default to 0]
**Enabletracking** | **int** | Enable xAPI tracking. | [optional] [default to 1]
**Grade** | **int** | The maximum grade for submission. | [optional] [default to 0]
**Grademethod** | **int** | Which H5P attempt is used for grading. | [optional] [default to 1]
**Id** | **int** | The primary key of the record. | [optional] 
**Intro** | **string** | H5P activity description. | [optional] [default to ""]
**Introfiles** | [**List&lt;CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner&gt;**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**Introformat** | **int** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**Name** | **string** | The name of the activity module instance. | [optional] [default to "null"]
**Package** | [**List&lt;CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner&gt;**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**Timecreated** | **int** | Timestamp of when the instance was added to the course. | [optional] [default to null]
**Timemodified** | **int** | Timestamp of when the instance was last modified. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

