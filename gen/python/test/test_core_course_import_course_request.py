# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_course_import_course_request import CoreCourseImportCourseRequest

class TestCoreCourseImportCourseRequest(unittest.TestCase):
    """CoreCourseImportCourseRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreCourseImportCourseRequest:
        """Test CoreCourseImportCourseRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreCourseImportCourseRequest`
        """
        model = CoreCourseImportCourseRequest()
        if include_optional:
            return CoreCourseImportCourseRequest(
                deletecontent = 56,
                importfrom = 56,
                importto = 56,
                options = [
                    openapi_client.models.core_course_import_course_request_options_inner.core_course_import_course_request_options_inner(
                        name = 'null', 
                        value = '', )
                    ]
            )
        else:
            return CoreCourseImportCourseRequest(
                importfrom = 56,
                importto = 56,
        )
        """

    def testCoreCourseImportCourseRequest(self):
        """Test CoreCourseImportCourseRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()