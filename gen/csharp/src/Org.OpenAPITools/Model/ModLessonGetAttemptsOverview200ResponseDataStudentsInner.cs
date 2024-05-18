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
    /// ModLessonGetAttemptsOverview200ResponseDataStudentsInner
    /// </summary>
    [DataContract(Name = "mod_lesson_get_attempts_overview_200_response_data_students_inner")]
    public partial class ModLessonGetAttemptsOverview200ResponseDataStudentsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModLessonGetAttemptsOverview200ResponseDataStudentsInner" /> class.
        /// </summary>
        /// <param name="attempts">attempts.</param>
        /// <param name="bestgrade">Best grade. (default to nullM).</param>
        /// <param name="fullname">User full name. (default to &quot;null&quot;).</param>
        /// <param name="id">User id..</param>
        public ModLessonGetAttemptsOverview200ResponseDataStudentsInner(List<ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner> attempts = default(List<ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner>), decimal bestgrade = nullM, string fullname = @"null", int id = default(int))
        {
            this.Attempts = attempts;
            this.Bestgrade = bestgrade;
            // use default value if no "fullname" provided
            this.Fullname = fullname ?? @"null";
            this.Id = id;
        }

        /// <summary>
        /// Gets or Sets Attempts
        /// </summary>
        [DataMember(Name = "attempts", EmitDefaultValue = false)]
        public List<ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner> Attempts { get; set; }

        /// <summary>
        /// Best grade.
        /// </summary>
        /// <value>Best grade.</value>
        [DataMember(Name = "bestgrade", EmitDefaultValue = false)]
        public decimal Bestgrade { get; set; }

        /// <summary>
        /// User full name.
        /// </summary>
        /// <value>User full name.</value>
        [DataMember(Name = "fullname", EmitDefaultValue = false)]
        public string Fullname { get; set; }

        /// <summary>
        /// User id.
        /// </summary>
        /// <value>User id.</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModLessonGetAttemptsOverview200ResponseDataStudentsInner {\n");
            sb.Append("  Attempts: ").Append(Attempts).Append("\n");
            sb.Append("  Bestgrade: ").Append(Bestgrade).Append("\n");
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