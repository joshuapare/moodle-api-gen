# CoreNotesGetCourseNotes200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Canmanagecoursenotes** | Pointer to **bool** | Whether the user can manage notes at the given course. | [optional] [default to null]
**Canmanagesystemnotes** | Pointer to **bool** | Whether the user can manage notes at system level. | [optional] [default to null]
**Coursenotes** | Pointer to [**[]CoreNotesGetCourseNotes200ResponseCoursenotesInner**](CoreNotesGetCourseNotes200ResponseCoursenotesInner.md) |  | [optional] 
**Personalnotes** | Pointer to [**[]CoreNotesGetCourseNotes200ResponsePersonalnotesInner**](CoreNotesGetCourseNotes200ResponsePersonalnotesInner.md) |  | [optional] 
**Sitenotes** | Pointer to [**[]CoreNotesGetCourseNotes200ResponsePersonalnotesInner**](CoreNotesGetCourseNotes200ResponsePersonalnotesInner.md) |  | [optional] 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreNotesGetCourseNotes200Response

`func NewCoreNotesGetCourseNotes200Response() *CoreNotesGetCourseNotes200Response`

NewCoreNotesGetCourseNotes200Response instantiates a new CoreNotesGetCourseNotes200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreNotesGetCourseNotes200ResponseWithDefaults

`func NewCoreNotesGetCourseNotes200ResponseWithDefaults() *CoreNotesGetCourseNotes200Response`

NewCoreNotesGetCourseNotes200ResponseWithDefaults instantiates a new CoreNotesGetCourseNotes200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCanmanagecoursenotes

`func (o *CoreNotesGetCourseNotes200Response) GetCanmanagecoursenotes() bool`

GetCanmanagecoursenotes returns the Canmanagecoursenotes field if non-nil, zero value otherwise.

### GetCanmanagecoursenotesOk

`func (o *CoreNotesGetCourseNotes200Response) GetCanmanagecoursenotesOk() (*bool, bool)`

GetCanmanagecoursenotesOk returns a tuple with the Canmanagecoursenotes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanmanagecoursenotes

`func (o *CoreNotesGetCourseNotes200Response) SetCanmanagecoursenotes(v bool)`

SetCanmanagecoursenotes sets Canmanagecoursenotes field to given value.

### HasCanmanagecoursenotes

`func (o *CoreNotesGetCourseNotes200Response) HasCanmanagecoursenotes() bool`

HasCanmanagecoursenotes returns a boolean if a field has been set.

### GetCanmanagesystemnotes

`func (o *CoreNotesGetCourseNotes200Response) GetCanmanagesystemnotes() bool`

GetCanmanagesystemnotes returns the Canmanagesystemnotes field if non-nil, zero value otherwise.

### GetCanmanagesystemnotesOk

`func (o *CoreNotesGetCourseNotes200Response) GetCanmanagesystemnotesOk() (*bool, bool)`

GetCanmanagesystemnotesOk returns a tuple with the Canmanagesystemnotes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanmanagesystemnotes

`func (o *CoreNotesGetCourseNotes200Response) SetCanmanagesystemnotes(v bool)`

SetCanmanagesystemnotes sets Canmanagesystemnotes field to given value.

### HasCanmanagesystemnotes

`func (o *CoreNotesGetCourseNotes200Response) HasCanmanagesystemnotes() bool`

HasCanmanagesystemnotes returns a boolean if a field has been set.

### GetCoursenotes

`func (o *CoreNotesGetCourseNotes200Response) GetCoursenotes() []CoreNotesGetCourseNotes200ResponseCoursenotesInner`

GetCoursenotes returns the Coursenotes field if non-nil, zero value otherwise.

### GetCoursenotesOk

`func (o *CoreNotesGetCourseNotes200Response) GetCoursenotesOk() (*[]CoreNotesGetCourseNotes200ResponseCoursenotesInner, bool)`

GetCoursenotesOk returns a tuple with the Coursenotes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoursenotes

`func (o *CoreNotesGetCourseNotes200Response) SetCoursenotes(v []CoreNotesGetCourseNotes200ResponseCoursenotesInner)`

SetCoursenotes sets Coursenotes field to given value.

### HasCoursenotes

`func (o *CoreNotesGetCourseNotes200Response) HasCoursenotes() bool`

HasCoursenotes returns a boolean if a field has been set.

### GetPersonalnotes

`func (o *CoreNotesGetCourseNotes200Response) GetPersonalnotes() []CoreNotesGetCourseNotes200ResponsePersonalnotesInner`

GetPersonalnotes returns the Personalnotes field if non-nil, zero value otherwise.

### GetPersonalnotesOk

`func (o *CoreNotesGetCourseNotes200Response) GetPersonalnotesOk() (*[]CoreNotesGetCourseNotes200ResponsePersonalnotesInner, bool)`

GetPersonalnotesOk returns a tuple with the Personalnotes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPersonalnotes

`func (o *CoreNotesGetCourseNotes200Response) SetPersonalnotes(v []CoreNotesGetCourseNotes200ResponsePersonalnotesInner)`

SetPersonalnotes sets Personalnotes field to given value.

### HasPersonalnotes

`func (o *CoreNotesGetCourseNotes200Response) HasPersonalnotes() bool`

HasPersonalnotes returns a boolean if a field has been set.

### GetSitenotes

`func (o *CoreNotesGetCourseNotes200Response) GetSitenotes() []CoreNotesGetCourseNotes200ResponsePersonalnotesInner`

GetSitenotes returns the Sitenotes field if non-nil, zero value otherwise.

### GetSitenotesOk

`func (o *CoreNotesGetCourseNotes200Response) GetSitenotesOk() (*[]CoreNotesGetCourseNotes200ResponsePersonalnotesInner, bool)`

GetSitenotesOk returns a tuple with the Sitenotes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSitenotes

`func (o *CoreNotesGetCourseNotes200Response) SetSitenotes(v []CoreNotesGetCourseNotes200ResponsePersonalnotesInner)`

SetSitenotes sets Sitenotes field to given value.

### HasSitenotes

`func (o *CoreNotesGetCourseNotes200Response) HasSitenotes() bool`

HasSitenotes returns a boolean if a field has been set.

### GetWarnings

`func (o *CoreNotesGetCourseNotes200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreNotesGetCourseNotes200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreNotesGetCourseNotes200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreNotesGetCourseNotes200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


