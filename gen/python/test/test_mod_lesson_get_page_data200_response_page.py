# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_lesson_get_page_data200_response_page import ModLessonGetPageData200ResponsePage

class TestModLessonGetPageData200ResponsePage(unittest.TestCase):
    """ModLessonGetPageData200ResponsePage unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModLessonGetPageData200ResponsePage:
        """Test ModLessonGetPageData200ResponsePage
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModLessonGetPageData200ResponsePage`
        """
        model = ModLessonGetPageData200ResponsePage()
        if include_optional:
            return ModLessonGetPageData200ResponsePage(
                contents = 'null',
                contentsformat = 56,
                display = 56,
                displayinmenublock = True,
                id = 56,
                layout = 56,
                lessonid = 56,
                nextpageid = 56,
                prevpageid = 56,
                qoption = 56,
                qtype = 56,
                timecreated = 56,
                timemodified = 56,
                title = 'null',
                type = 56,
                typeid = 56,
                typestring = 'null'
            )
        else:
            return ModLessonGetPageData200ResponsePage(
                display = 56,
                displayinmenublock = True,
                id = 56,
                layout = 56,
                lessonid = 56,
                nextpageid = 56,
                prevpageid = 56,
                qoption = 56,
                qtype = 56,
                timecreated = 56,
                timemodified = 56,
                type = 56,
                typeid = 56,
                typestring = 'null',
        )
        """

    def testModLessonGetPageData200ResponsePage(self):
        """Test ModLessonGetPageData200ResponsePage"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
