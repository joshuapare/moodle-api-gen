/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = MoodleClient.Client.OpenAPIDateConverter;

namespace MoodleClient.Model
{
    /// <summary>
    /// CoreCourseSearchCourses200ResponseCoursesInnerContactsInner
    /// </summary>
    [DataContract(Name = "core_course_search_courses_200_response_courses_inner_contacts_inner")]
    public partial class CoreCourseSearchCourses200ResponseCoursesInnerContactsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCourseSearchCourses200ResponseCoursesInnerContactsInner" /> class.
        /// </summary>
        /// <param name="fullname">contact user fullname.</param>
        /// <param name="id">contact user id.</param>
        public CoreCourseSearchCourses200ResponseCoursesInnerContactsInner(string fullname = default(string), int id = default(int))
        {
            this.Fullname = fullname;
            this.Id = id;
        }

        /// <summary>
        /// contact user fullname
        /// </summary>
        /// <value>contact user fullname</value>
        [DataMember(Name = "fullname", EmitDefaultValue = false)]
        public string Fullname { get; set; }

        /// <summary>
        /// contact user id
        /// </summary>
        /// <value>contact user id</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCourseSearchCourses200ResponseCoursesInnerContactsInner {\n");
            sb.Append("  Fullname: ").Append(Fullname).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}