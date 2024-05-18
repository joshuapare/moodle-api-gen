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
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// CoreCourseGetEnrolledUsersByCmidRequest
    /// </summary>
    [DataContract(Name = "core_course_get_enrolled_users_by_cmid_request")]
    public partial class CoreCourseGetEnrolledUsersByCmidRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCourseGetEnrolledUsersByCmidRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreCourseGetEnrolledUsersByCmidRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCourseGetEnrolledUsersByCmidRequest" /> class.
        /// </summary>
        /// <param name="cmid">id of the course module (required) (default to null).</param>
        /// <param name="groupid">id of the group (default to 0).</param>
        /// <param name="onlyactive">whether to return only active users or all. (default to false).</param>
        public CoreCourseGetEnrolledUsersByCmidRequest(int cmid = null, int groupid = 0, bool onlyactive = false)
        {
            this.Cmid = cmid;
            this.Groupid = groupid;
            this.Onlyactive = onlyactive;
        }

        /// <summary>
        /// id of the course module
        /// </summary>
        /// <value>id of the course module</value>
        [DataMember(Name = "cmid", IsRequired = true, EmitDefaultValue = true)]
        public int Cmid { get; set; }

        /// <summary>
        /// id of the group
        /// </summary>
        /// <value>id of the group</value>
        [DataMember(Name = "groupid", EmitDefaultValue = false)]
        public int Groupid { get; set; }

        /// <summary>
        /// whether to return only active users or all.
        /// </summary>
        /// <value>whether to return only active users or all.</value>
        [DataMember(Name = "onlyactive", EmitDefaultValue = true)]
        public bool Onlyactive { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCourseGetEnrolledUsersByCmidRequest {\n");
            sb.Append("  Cmid: ").Append(Cmid).Append("\n");
            sb.Append("  Groupid: ").Append(Groupid).Append("\n");
            sb.Append("  Onlyactive: ").Append(Onlyactive).Append("\n");
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