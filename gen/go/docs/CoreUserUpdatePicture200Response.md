# CoreUserUpdatePicture200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Profileimageurl** | Pointer to **string** | New profile user image url | [optional] [default to "null"]
**Success** | **bool** | True if the image was updated, false otherwise. | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreUserUpdatePicture200Response

`func NewCoreUserUpdatePicture200Response(success bool, ) *CoreUserUpdatePicture200Response`

NewCoreUserUpdatePicture200Response instantiates a new CoreUserUpdatePicture200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreUserUpdatePicture200ResponseWithDefaults

`func NewCoreUserUpdatePicture200ResponseWithDefaults() *CoreUserUpdatePicture200Response`

NewCoreUserUpdatePicture200ResponseWithDefaults instantiates a new CoreUserUpdatePicture200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetProfileimageurl

`func (o *CoreUserUpdatePicture200Response) GetProfileimageurl() string`

GetProfileimageurl returns the Profileimageurl field if non-nil, zero value otherwise.

### GetProfileimageurlOk

`func (o *CoreUserUpdatePicture200Response) GetProfileimageurlOk() (*string, bool)`

GetProfileimageurlOk returns a tuple with the Profileimageurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProfileimageurl

`func (o *CoreUserUpdatePicture200Response) SetProfileimageurl(v string)`

SetProfileimageurl sets Profileimageurl field to given value.

### HasProfileimageurl

`func (o *CoreUserUpdatePicture200Response) HasProfileimageurl() bool`

HasProfileimageurl returns a boolean if a field has been set.

### GetSuccess

`func (o *CoreUserUpdatePicture200Response) GetSuccess() bool`

GetSuccess returns the Success field if non-nil, zero value otherwise.

### GetSuccessOk

`func (o *CoreUserUpdatePicture200Response) GetSuccessOk() (*bool, bool)`

GetSuccessOk returns a tuple with the Success field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSuccess

`func (o *CoreUserUpdatePicture200Response) SetSuccess(v bool)`

SetSuccess sets Success field to given value.


### GetWarnings

`func (o *CoreUserUpdatePicture200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreUserUpdatePicture200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreUserUpdatePicture200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreUserUpdatePicture200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


