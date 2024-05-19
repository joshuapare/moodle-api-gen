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
    /// CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCategory
    /// </summary>
    [DataContract(Name = "core_calendar_get_action_events_by_course_200_response_events_inner_category")]
    public partial class CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCategory : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCategory" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCategory() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCategory" /> class.
        /// </summary>
        /// <param name="coursecount">coursecount (required) (default to 0).</param>
        /// <param name="depth">depth (required) (default to 0).</param>
        /// <param name="description">description (default to &quot;null&quot;).</param>
        /// <param name="id">id (required) (default to null).</param>
        /// <param name="idnumber">idnumber (required) (default to &quot;null&quot;).</param>
        /// <param name="name">name (required) (default to &quot;&quot;).</param>
        /// <param name="nestedname">nestedname (required) (default to &quot;null&quot;).</param>
        /// <param name="parent">parent (required) (default to null).</param>
        /// <param name="timemodified">timemodified (required) (default to 0).</param>
        /// <param name="url">url (required).</param>
        /// <param name="visible">visible (required) (default to 1).</param>
        public CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCategory(int coursecount = 0, int depth = 0, string description = @"null", int id = null, string idnumber = @"null", string name = @"", string nestedname = @"null", int parent = null, int timemodified = 0, string url = default(string), int visible = 1)
        {
            this.Coursecount = coursecount;
            this.Depth = depth;
            this.Id = id;
            // to ensure "idnumber" is required (not null)
            if (idnumber == null)
            {
                throw new ArgumentNullException("idnumber is a required property for CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCategory and cannot be null");
            }
            this.Idnumber = idnumber;
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new ArgumentNullException("name is a required property for CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCategory and cannot be null");
            }
            this.Name = name;
            // to ensure "nestedname" is required (not null)
            if (nestedname == null)
            {
                throw new ArgumentNullException("nestedname is a required property for CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCategory and cannot be null");
            }
            this.Nestedname = nestedname;
            this.Parent = parent;
            this.Timemodified = timemodified;
            // to ensure "url" is required (not null)
            if (url == null)
            {
                throw new ArgumentNullException("url is a required property for CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCategory and cannot be null");
            }
            this.Url = url;
            this.Visible = visible;
            // use default value if no "description" provided
            this.Description = description ?? @"null";
        }

        /// <summary>
        /// coursecount
        /// </summary>
        /// <value>coursecount</value>
        [DataMember(Name = "coursecount", IsRequired = true, EmitDefaultValue = true)]
        public int Coursecount { get; set; }

        /// <summary>
        /// depth
        /// </summary>
        /// <value>depth</value>
        [DataMember(Name = "depth", IsRequired = true, EmitDefaultValue = true)]
        public int Depth { get; set; }

        /// <summary>
        /// description
        /// </summary>
        /// <value>description</value>
        [DataMember(Name = "description", EmitDefaultValue = false)]
        public string Description { get; set; }

        /// <summary>
        /// id
        /// </summary>
        /// <value>id</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public int Id { get; set; }

        /// <summary>
        /// idnumber
        /// </summary>
        /// <value>idnumber</value>
        [DataMember(Name = "idnumber", IsRequired = true, EmitDefaultValue = true)]
        public string Idnumber { get; set; }

        /// <summary>
        /// name
        /// </summary>
        /// <value>name</value>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// nestedname
        /// </summary>
        /// <value>nestedname</value>
        [DataMember(Name = "nestedname", IsRequired = true, EmitDefaultValue = true)]
        public string Nestedname { get; set; }

        /// <summary>
        /// parent
        /// </summary>
        /// <value>parent</value>
        [DataMember(Name = "parent", IsRequired = true, EmitDefaultValue = true)]
        public int Parent { get; set; }

        /// <summary>
        /// timemodified
        /// </summary>
        /// <value>timemodified</value>
        [DataMember(Name = "timemodified", IsRequired = true, EmitDefaultValue = true)]
        public int Timemodified { get; set; }

        /// <summary>
        /// url
        /// </summary>
        /// <value>url</value>
        [DataMember(Name = "url", IsRequired = true, EmitDefaultValue = true)]
        public string Url { get; set; }

        /// <summary>
        /// visible
        /// </summary>
        /// <value>visible</value>
        [DataMember(Name = "visible", IsRequired = true, EmitDefaultValue = true)]
        public int Visible { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCategory {\n");
            sb.Append("  Coursecount: ").Append(Coursecount).Append("\n");
            sb.Append("  Depth: ").Append(Depth).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Idnumber: ").Append(Idnumber).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Nestedname: ").Append(Nestedname).Append("\n");
            sb.Append("  Parent: ").Append(Parent).Append("\n");
            sb.Append("  Timemodified: ").Append(Timemodified).Append("\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
            sb.Append("  Visible: ").Append(Visible).Append("\n");
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
