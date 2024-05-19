# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.mod_lesson_process_page_request_data_inner import ModLessonProcessPageRequestDataInner
from typing import Optional, Set
from typing_extensions import Self

class ModLessonProcessPageRequest(BaseModel):
    """
    ModLessonProcessPageRequest
    """ # noqa: E501
    data: List[ModLessonProcessPageRequestDataInner]
    lessonid: StrictInt = Field(description="lesson instance id")
    pageid: StrictInt = Field(description="the page id")
    password: Optional[StrictStr] = Field(default='', description="optional password (the lesson may be protected)")
    review: Optional[StrictBool] = Field(default=False, description="if we want to review just after finishing (1 hour margin)")
    __properties: ClassVar[List[str]] = ["data", "lessonid", "pageid", "password", "review"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of ModLessonProcessPageRequest from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of each item in data (list)
        _items = []
        if self.data:
            for _item in self.data:
                if _item:
                    _items.append(_item.to_dict())
            _dict['data'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ModLessonProcessPageRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "data": [ModLessonProcessPageRequestDataInner.from_dict(_item) for _item in obj["data"]] if obj.get("data") is not None else None,
            "lessonid": obj.get("lessonid"),
            "pageid": obj.get("pageid"),
            "password": obj.get("password") if obj.get("password") is not None else '',
            "review": obj.get("review") if obj.get("review") is not None else False
        })
        return _obj


