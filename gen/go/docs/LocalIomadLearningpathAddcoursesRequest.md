# LocalIomadLearningpathAddcoursesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courseids** | **[]map[string]interface{}** |  | 
**Groupid** | Pointer to **int32** | ID of group. If 0 just add to lowest numbered group | [optional] [default to 0]
**Pathid** | **int32** | ID of Iomad Learning Path | [default to null]

## Methods

### NewLocalIomadLearningpathAddcoursesRequest

`func NewLocalIomadLearningpathAddcoursesRequest(courseids []map[string]interface{}, pathid int32, ) *LocalIomadLearningpathAddcoursesRequest`

NewLocalIomadLearningpathAddcoursesRequest instantiates a new LocalIomadLearningpathAddcoursesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLocalIomadLearningpathAddcoursesRequestWithDefaults

`func NewLocalIomadLearningpathAddcoursesRequestWithDefaults() *LocalIomadLearningpathAddcoursesRequest`

NewLocalIomadLearningpathAddcoursesRequestWithDefaults instantiates a new LocalIomadLearningpathAddcoursesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourseids

`func (o *LocalIomadLearningpathAddcoursesRequest) GetCourseids() []map[string]interface{}`

GetCourseids returns the Courseids field if non-nil, zero value otherwise.

### GetCourseidsOk

`func (o *LocalIomadLearningpathAddcoursesRequest) GetCourseidsOk() (*[]map[string]interface{}, bool)`

GetCourseidsOk returns a tuple with the Courseids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseids

`func (o *LocalIomadLearningpathAddcoursesRequest) SetCourseids(v []map[string]interface{})`

SetCourseids sets Courseids field to given value.


### GetGroupid

`func (o *LocalIomadLearningpathAddcoursesRequest) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *LocalIomadLearningpathAddcoursesRequest) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *LocalIomadLearningpathAddcoursesRequest) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.

### HasGroupid

`func (o *LocalIomadLearningpathAddcoursesRequest) HasGroupid() bool`

HasGroupid returns a boolean if a field has been set.

### GetPathid

`func (o *LocalIomadLearningpathAddcoursesRequest) GetPathid() int32`

GetPathid returns the Pathid field if non-nil, zero value otherwise.

### GetPathidOk

`func (o *LocalIomadLearningpathAddcoursesRequest) GetPathidOk() (*int32, bool)`

GetPathidOk returns a tuple with the Pathid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPathid

`func (o *LocalIomadLearningpathAddcoursesRequest) SetPathid(v int32)`

SetPathid sets Pathid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


