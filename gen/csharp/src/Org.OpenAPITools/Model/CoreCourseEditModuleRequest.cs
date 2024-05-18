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
    /// CoreCourseEditModuleRequest
    /// </summary>
    [DataContract(Name = "core_course_edit_module_request")]
    public partial class CoreCourseEditModuleRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCourseEditModuleRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreCourseEditModuleRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCourseEditModuleRequest" /> class.
        /// </summary>
        /// <param name="action">action: hide, show, stealth, duplicate, delete, moveleft, moveright, group... (required) (default to &quot;null&quot;).</param>
        /// <param name="id">course module id (required).</param>
        /// <param name="sectionreturn">section to return to (default to null).</param>
        public CoreCourseEditModuleRequest(string action = @"null", int id = default(int), int sectionreturn = null)
        {
            // to ensure "action" is required (not null)
            if (action == null)
            {
                throw new ArgumentNullException("action is a required property for CoreCourseEditModuleRequest and cannot be null");
            }
            this.Action = action;
            this.Id = id;
            this.Sectionreturn = sectionreturn;
        }

        /// <summary>
        /// action: hide, show, stealth, duplicate, delete, moveleft, moveright, group...
        /// </summary>
        /// <value>action: hide, show, stealth, duplicate, delete, moveleft, moveright, group...</value>
        [DataMember(Name = "action", IsRequired = true, EmitDefaultValue = true)]
        public string Action { get; set; }

        /// <summary>
        /// course module id
        /// </summary>
        /// <value>course module id</value>
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
            sb.Append("class CoreCourseEditModuleRequest {\n");
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
