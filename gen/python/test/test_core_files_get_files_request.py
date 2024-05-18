# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_files_get_files_request import CoreFilesGetFilesRequest

class TestCoreFilesGetFilesRequest(unittest.TestCase):
    """CoreFilesGetFilesRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreFilesGetFilesRequest:
        """Test CoreFilesGetFilesRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreFilesGetFilesRequest`
        """
        model = CoreFilesGetFilesRequest()
        if include_optional:
            return CoreFilesGetFilesRequest(
                component = '',
                contextid = 56,
                contextlevel = 'null',
                filearea = 'null',
                filename = 'null',
                filepath = 'null',
                instanceid = 56,
                itemid = 56,
                modified = 56
            )
        else:
            return CoreFilesGetFilesRequest(
                component = '',
                contextid = 56,
                filearea = 'null',
                filename = 'null',
                filepath = 'null',
                itemid = 56,
        )
        """

    def testCoreFilesGetFilesRequest(self):
        """Test CoreFilesGetFilesRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()