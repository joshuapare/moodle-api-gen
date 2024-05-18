# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.api.block_starredcourses_api import BlockStarredcoursesApi


class TestBlockStarredcoursesApi(unittest.TestCase):
    """BlockStarredcoursesApi unit test stubs"""

    def setUp(self) -> None:
        self.api = BlockStarredcoursesApi()

    def tearDown(self) -> None:
        pass

    def test_block_starredcourses_get_starred_courses(self) -> None:
        """Test case for block_starredcourses_get_starred_courses

        Get users starred courses.
        """
        pass


if __name__ == '__main__':
    unittest.main()