# CoreBlockGetCourseBlocksRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courseid** | **int32** | course id | [default to null]
**Returncontents** | Pointer to **bool** | Whether to return the block contents. | [optional] [default to false]

## Methods

### NewCoreBlockGetCourseBlocksRequest

`func NewCoreBlockGetCourseBlocksRequest(courseid int32, ) *CoreBlockGetCourseBlocksRequest`

NewCoreBlockGetCourseBlocksRequest instantiates a new CoreBlockGetCourseBlocksRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreBlockGetCourseBlocksRequestWithDefaults

`func NewCoreBlockGetCourseBlocksRequestWithDefaults() *CoreBlockGetCourseBlocksRequest`

NewCoreBlockGetCourseBlocksRequestWithDefaults instantiates a new CoreBlockGetCourseBlocksRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourseid

`func (o *CoreBlockGetCourseBlocksRequest) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *CoreBlockGetCourseBlocksRequest) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *CoreBlockGetCourseBlocksRequest) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.


### GetReturncontents

`func (o *CoreBlockGetCourseBlocksRequest) GetReturncontents() bool`

GetReturncontents returns the Returncontents field if non-nil, zero value otherwise.

### GetReturncontentsOk

`func (o *CoreBlockGetCourseBlocksRequest) GetReturncontentsOk() (*bool, bool)`

GetReturncontentsOk returns a tuple with the Returncontents field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReturncontents

`func (o *CoreBlockGetCourseBlocksRequest) SetReturncontents(v bool)`

SetReturncontents sets Returncontents field to given value.

### HasReturncontents

`func (o *CoreBlockGetCourseBlocksRequest) HasReturncontents() bool`

HasReturncontents returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


