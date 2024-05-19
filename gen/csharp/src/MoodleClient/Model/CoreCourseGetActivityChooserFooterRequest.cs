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
    /// CoreCourseGetActivityChooserFooterRequest
    /// </summary>
    [DataContract(Name = "core_course_get_activity_chooser_footer_request")]
    public partial class CoreCourseGetActivityChooserFooterRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCourseGetActivityChooserFooterRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreCourseGetActivityChooserFooterRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCourseGetActivityChooserFooterRequest" /> class.
        /// </summary>
        /// <param name="courseid">ID of the course (required) (default to null).</param>
        /// <param name="sectionid">ID of the section (required) (default to null).</param>
        public CoreCourseGetActivityChooserFooterRequest(int courseid = null, int sectionid = null)
        {
            this.Courseid = courseid;
            this.Sectionid = sectionid;
        }

        /// <summary>
        /// ID of the course
        /// </summary>
        /// <value>ID of the course</value>
        [DataMember(Name = "courseid", IsRequired = true, EmitDefaultValue = true)]
        public int Courseid { get; set; }

        /// <summary>
        /// ID of the section
        /// </summary>
        /// <value>ID of the section</value>
        [DataMember(Name = "sectionid", IsRequired = true, EmitDefaultValue = true)]
        public int Sectionid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCourseGetActivityChooserFooterRequest {\n");
            sb.Append("  Courseid: ").Append(Courseid).Append("\n");
            sb.Append("  Sectionid: ").Append(Sectionid).Append("\n");
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