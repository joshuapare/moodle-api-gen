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
    /// CoreCourseEditSectionRequest
    /// </summary>
    [DataContract(Name = "core_course_edit_section_request")]
    public partial class CoreCourseEditSectionRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCourseEditSectionRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreCourseEditSectionRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCourseEditSectionRequest" /> class.
        /// </summary>
        /// <param name="action">action: hide, show, stealth, setmarker, removemarker (required) (default to &quot;null&quot;).</param>
        /// <param name="id">course section id (required) (default to null).</param>
        /// <param name="sectionreturn">section to return to.</param>
        public CoreCourseEditSectionRequest(string action = @"null", int id = null, int sectionreturn = default(int))
        {
            // to ensure "action" is required (not null)
            if (action == null)
            {
                throw new ArgumentNullException("action is a required property for CoreCourseEditSectionRequest and cannot be null");
            }
            this.Action = action;
            this.Id = id;
            this.Sectionreturn = sectionreturn;
        }

        /// <summary>
        /// action: hide, show, stealth, setmarker, removemarker
        /// </summary>
        /// <value>action: hide, show, stealth, setmarker, removemarker</value>
        [DataMember(Name = "action", IsRequired = true, EmitDefaultValue = true)]
        public string Action { get; set; }

        /// <summary>
        /// course section id
        /// </summary>
        /// <value>course section id</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public int Id { get; set; }

        /// <summary>
        /// section to return to
        /// </summary>
        /// <value>section to return to</value>
        [DataMember(Name = "sectionreturn", EmitDefaultValue = false)]
        public int Sectionreturn { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCourseEditSectionRequest {\n");
            sb.Append("  Action: ").Append(Action).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Sectionreturn: ").Append(Sectionreturn).Append("\n");
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
