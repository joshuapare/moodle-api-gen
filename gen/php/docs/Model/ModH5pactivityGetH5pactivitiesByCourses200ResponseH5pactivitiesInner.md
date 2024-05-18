# # ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contenthash** | **string** | Sha1 hash of file content. | [optional] [default to 'null']
**context** | **int** | context | [optional] [default to null]
**course** | **int** | Course id this h5p activity is part of. | [optional] [default to null]
**coursemodule** | **int** | coursemodule | [optional]
**deployedfile** | [**\OpenAPI\Client\Model\ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInnerDeployedfile**](ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInnerDeployedfile.md) |  | [optional]
**displayoptions** | **int** | H5P Button display options. | [optional] [default to 0]
**enabletracking** | **int** | Enable xAPI tracking. | [optional] [default to 1]
**grade** | **int** | The maximum grade for submission. | [optional] [default to 0]
**grademethod** | **int** | Which H5P attempt is used for grading. | [optional] [default to 1]
**id** | **int** | The primary key of the record. | [optional]
**intro** | **string** | H5P activity description. | [optional] [default to '']
**introfiles** | [**\OpenAPI\Client\Model\CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner[]**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional]
**introformat** | **int** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**name** | **string** | The name of the activity module instance. | [optional] [default to 'null']
**package** | [**\OpenAPI\Client\Model\CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner[]**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional]
**timecreated** | **int** | Timestamp of when the instance was added to the course. | [optional] [default to null]
**timemodified** | **int** | Timestamp of when the instance was last modified. | [optional] [default to null]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
