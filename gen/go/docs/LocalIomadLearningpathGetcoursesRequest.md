# LocalIomadLearningpathGetcoursesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Groupid** | Pointer to **int32** | ID of Iomad Learning Path group (0 &#x3D; return all) | [optional] [default to 0]
**Pathid** | **int32** | ID of Iomad Learning Path | 

## Methods

### NewLocalIomadLearningpathGetcoursesRequest

`func NewLocalIomadLearningpathGetcoursesRequest(pathid int32, ) *LocalIomadLearningpathGetcoursesRequest`

NewLocalIomadLearningpathGetcoursesRequest instantiates a new LocalIomadLearningpathGetcoursesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLocalIomadLearningpathGetcoursesRequestWithDefaults

`func NewLocalIomadLearningpathGetcoursesRequestWithDefaults() *LocalIomadLearningpathGetcoursesRequest`

NewLocalIomadLearningpathGetcoursesRequestWithDefaults instantiates a new LocalIomadLearningpathGetcoursesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetGroupid

`func (o *LocalIomadLearningpathGetcoursesRequest) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *LocalIomadLearningpathGetcoursesRequest) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *LocalIomadLearningpathGetcoursesRequest) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.

### HasGroupid

`func (o *LocalIomadLearningpathGetcoursesRequest) HasGroupid() bool`

HasGroupid returns a boolean if a field has been set.

### GetPathid

`func (o *LocalIomadLearningpathGetcoursesRequest) GetPathid() int32`

GetPathid returns the Pathid field if non-nil, zero value otherwise.

### GetPathidOk

`func (o *LocalIomadLearningpathGetcoursesRequest) GetPathidOk() (*int32, bool)`

GetPathidOk returns a tuple with the Pathid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPathid

`func (o *LocalIomadLearningpathGetcoursesRequest) SetPathid(v int32)`

SetPathid sets Pathid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


