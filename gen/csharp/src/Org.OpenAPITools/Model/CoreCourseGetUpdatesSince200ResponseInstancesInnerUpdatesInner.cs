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
    /// CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner
    /// </summary>
    [DataContract(Name = "core_course_get_updates_since_200_response_instances_inner_updates_inner")]
    public partial class CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner" /> class.
        /// </summary>
        /// <param name="itemids">itemids.</param>
        /// <param name="name">Name of the area updated..</param>
        /// <param name="timeupdated">Last time was updated.</param>
        public CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner(List<Object> itemids = default(List<Object>), string name = default(string), int timeupdated = default(int))
        {
            this.Itemids = itemids;
            this.Name = name;
            this.Timeupdated = timeupdated;
        }

        /// <summary>
        /// Gets or Sets Itemids
        /// </summary>
        [DataMember(Name = "itemids", EmitDefaultValue = false)]
        public List<Object> Itemids { get; set; }

        /// <summary>
        /// Name of the area updated.
        /// </summary>
        /// <value>Name of the area updated.</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Last time was updated
        /// </summary>
        /// <value>Last time was updated</value>
        [DataMember(Name = "timeupdated", EmitDefaultValue = false)]
        public int Timeupdated { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner {\n");
            sb.Append("  Itemids: ").Append(Itemids).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Timeupdated: ").Append(Timeupdated).Append("\n");
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
